package com.leetcode;

import java.util.ArrayList;

public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        ArrayList<Boolean> primes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            primes.add(true);
        }

        for (int i = 2; i * i < n; i++) {
            if (primes.get(i)) {
                //primes.set(i, false);

                for (int ii = i+i; ii < n; ii += i) {
                    primes.set(ii, false);
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes.get(i))
                count++;
        }
        return count;
    }

    public static int countPrimes1(int n) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();


        for (int i = 2; i < n; i++) {
            integerArrayList.add(i);
        }

        for (int i = 2; i * i < n; i++) {
            int ii = i;
            boolean remove = false;
            while (ii < n) {
                if (integerArrayList.indexOf(ii) >= 0 && remove)
                    integerArrayList.remove(integerArrayList.indexOf(ii));
                remove = true;
                ii = ii + i;
            }
        }
        /*
        Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()) {

        }

        while (iterator.hasNext()) {
            int next = iterator.next();
            while (next < n) {
                if (integerArrayList.contains(next)) {
                    integerArrayList.remove(next);
                }
                next = next + next;
            }
        }
        */
        return integerArrayList.size();
    }


    private static boolean isPrime(int n, int check) {
        if (n % check == 0)
            return false;
        if (check == n)
            return true;
        return isPrime(n, check + 1);
    }
}