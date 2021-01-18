package com.codility;

import java.util.ArrayList;
import java.util.List;

public class Main21 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("http://www.yahoo.com/");
        list.add("https://www.yahoo.com/News");
        list.add("https://sports.yahoo.com:8080/deneme");
        list = solution(list);
        System.out.println(list.toString());
    }

    public static List<String> solution(List<String> N) {
        for (String n : N)
            decode(n);
        return N;
    }

    private static String decode(String url) {
        url = url.replaceAll("\\.", "|");
        String[] sub = url.split("\\|");
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i]);
        }
        return url;
    }
}



