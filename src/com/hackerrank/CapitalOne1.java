package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CapitalOne1 {
    private static int[] bir = new int[]{1, 2, 3};
    private static int[] iki = new int[]{1, 2, 3, 4};

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        /*a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);*/

        System.out.println(getMaxElementIndexes(a1, a2));
    }

    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rotate.size(); i++) {
            temp = makeDeepCopyInteger((ArrayList<Integer>) a);
            for (int ii = 0; ii < rotate.get(i) % a.size(); ii++) {
                int t = temp.get(0);
                temp = temp.subList(1, temp.size());
                temp.add(t);

            }
            result.add(findmax(temp));
        }
        return result;
    }

    private static Integer findmax(List<Integer> temp) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > max) {
                max = temp.get(i);
                index = i;
            }
        }
        return index;
    }

    private static ArrayList<Integer> makeDeepCopyInteger(ArrayList<Integer> old) {
        ArrayList<Integer> copy = new ArrayList<Integer>(old.size());
        for (Integer i : old) {
            copy.add(new Integer(i));
        }
        return copy;
    }

}
