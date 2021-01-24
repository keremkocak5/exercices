package com.other;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExercises {


    public static void main(String[] args) {

        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));

        List<Person> filtered =
                persons.stream()
                        .filter(p -> p.name.startsWith("P"))
                        .collect(Collectors.toList());

        System.out.println(persons);
        System.out.println(filtered);

        Map<Integer, List<Person>> hm = persons.stream().collect(Collectors.groupingBy(p -> p.age));
        hm.forEach((age, p) -> System.out.println("age" + age + " , " + p));

        Double aa = persons.stream().collect(Collectors.averagingDouble(c -> c.age));
        System.out.println(aa);

        IntSummaryStatistics ageSummary =
                persons
                        .stream()
                        .collect(Collectors.summarizingInt(p -> p.age));

        System.out.println(ageSummary);

        String phrase = persons
                .stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                //.map(p-> p.toString())
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);


        Map<Integer, String> bizimMap = persons.stream().collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));
        System.out.println(bizimMap);

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                        (j1, j2) -> j1.merge(j2),               // combiner
                        StringJoiner::toString);                // finisher
        String names = persons
                .stream()
                .collect(personNameCollector);
        System.out.println(names);  // MAX | PETER | PAMELA | DAVID


        List<Foo> foos = new ArrayList<>();

// create foos
        IntStream
                .range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

// create bars
        foos.forEach(f ->
                IntStream
                        .range(1, 4)
                        .forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name))));
        foos.stream().flatMap(f -> f.bars.stream()).forEach(b -> System.out.println(b.name));

        IntStream.range(1, 4).mapToObj(i -> new Foo("Foo" + i)).peek(f -> IntStream.range(1, 4).mapToObj(ff -> new Bar("Bar" + ff + "<-" + f.name)).forEach(f.bars::add)).flatMap(f -> f.bars.stream()).forEach(b -> System.out.println(b.name));

        persons
                .stream()
                .reduce((p1, p2) -> p1.age < p2.age ? p1 : p2)
                .ifPresent(System.out::println);    // Pamela

        Person result =
                persons
                        .stream()
                        .reduce(new Person("", 0), (p1, p2) -> {
                            p1.age += p2.age;
                            p1.name += p2.name;
                            return p1;
                        });

        System.out.format("name=%s; age=%s", result.name, result.age);

        Integer ageSum = persons
                .stream()
                .reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);

        System.out.println(">>" + ageSum);  // 76

    }


    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }


    static class Foo {
        String name;
        List<Bar> bars = new ArrayList<>();

        Foo(String name) {
            this.name = name;
        }
    }

    static class Bar {
        String name;

        Bar(String name) {
            this.name = name;
        }
    }
}
