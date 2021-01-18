package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascaslsTriangle {


    public static void main(String[] args) {
        generate(0);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0)
            return list;
        List<Integer> e = new ArrayList<>();
        e.add(1);
        list.add(e);
        if (numRows == 1)
            return list;

        e = new ArrayList<>();
        e.add(1);
        e.add(1);
        list.add(e);


        for (int i = 2; i < numRows; i++) {
            e = new ArrayList<>();
            for (int ii = 0; ii < /*((list.get(i - 1).size()) ) */i; ii++) {
                if (ii == 0) {
                    e.add(list.get(i - 1).get(0));
                } else {
                    e.add(list.get(i - 1).get(ii) + list.get(i - 1).get(ii - 1));
                }
            }
            e.add(list.get(i - 1).get(i - 1));
            list.add(e);
        }
        System.out.println("");

/*-

        for (int i = 1; i < numRows / 2; i++) {
            e = new ArrayList<>();
            for (int ii = 0; ii < i; ii++) {
                if (ii == 0) {
                    e.add(list.get(i - 1).get(ii));
                } else {
                    e.add(list.get(i - 1).get(ii - 1) + list.get(i - 1).get(ii));
                }
            }
            list.add(e);
        }

*/



        /*
        for (int i = 0; i < numRows; i++) {
            if (i == 1) {
                List<Integer> e = new ArrayList<>();
                e.add(1);
                list.add(e);
            } else {
                List<Integer> e = new ArrayList<>();
                int added = list.get(i - 1).get(0);
                e.add(added);
                for (int ii = 0; ii < list.get(i - 1).size(); ii++) {
                    int added2 = list.get(i - 1).get(ii);
                    e.add(added + added2);
                }
            }
        }*/

        return list;
    }

}