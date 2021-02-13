package com.hackerrank;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {
    private static final String[] magazine = new String[]{"give", "me", "one", "grand", "today", "night"};
    private static String[] note = new String[]{"give", "one", "grand1", "today"};


    public static void main(String[] args) {
        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> magazineMap = Arrays.asList(magazine).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> noteMap = Arrays.asList(note).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> noteElement : noteMap.entrySet()) {
            if (!magazineMap.containsKey(noteElement.getKey()) || magazineMap.get(noteElement.getKey()) < noteElement.getValue()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
