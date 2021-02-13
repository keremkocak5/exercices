package com.hackerrank;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("xxx", "art"));
    }

    static String twoStrings(String s1, String s2) {
        //Map<String, Long> hm1 = Arrays.asList(s1.toCharArray()).stream().map(c -> String.valueOf(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //Map<String, Long> hm2 = Arrays.asList(s2.toCharArray()).stream().map(c -> String.valueOf(c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> hm1 = s1.chars().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> hm2 = s2.chars().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> noteElement : hm1.entrySet()) {
            if (hm2.containsKey(noteElement.getKey())) {
                return "YES";
            }
        }
        return "NO";
    }
}
