package com.codility;

import java.util.*;
import java.util.function.Predicate;

public class Lambda1 {

    public static void main(String[] args) {
        List<Person> p = Arrays.asList(new Person("Ali", "Somel", 41),
                new Person("Mehmet", "Somel", 70),
                new Person("Gulayse", "Kocak", 65),
                new Person("Sinan", "Kocak", 35)
        );

        Comparator<Person> comparator = (Person p1, Person p2) -> {
            return p1.getLastName().compareTo(p2.getLastName());
        };
        Collections.sort(p, comparator);


        Printer printer = (pp) -> {
            for (Person person : pp) {
                System.out.println(person.toString());
            }
        };
        printer.print(p);

        LastNameFilter lastNameFilter = (pp, k) -> {
            for (Person person : pp) {
                if (person.getLastName().substring(0, 1).equals(k))
                    System.out.println(person.toString());
            }
        };

        lastNameFilter.filter(p, "K");
        String x = "";
        x.startsWith("x");

        // sort the list by lastname

        // print all elements of list

        // create method last name starts with K

        ArrayList<String> al = new ArrayList<>();
        al.add("kerem");
        al.add("elif");
        al.add("bir");
        al.add("iki");
        al.add("uc");
        al.add("dort");
        al.add("bes");

        //x = (String y) -> System.out.println(y);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("deneme");
            }
        });

        thread.run();

        Thread lt = new Thread(() -> System.out.println("deneme2"));
        lt.run();

        deneme(p, (pm) -> pm.getLastName().startsWith("K"));

    }

    private static void deneme(List<Person> p, Predicate<Person> predicate) {
        for (Person pp : p)
            if (predicate.test(pp))
                System.out.print(">>" + pp.toString());
    }

    public interface Sorter {
        public void sort();
    }

    public interface Printer {
        public void print(List<Person> persons);
    }


    public interface LastNameFilter {
        public void filter(List<Person> persons, String lastNameInitial);
    }


}