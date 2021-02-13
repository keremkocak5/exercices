package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CapitalOne2 {
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

        a1.add(1);
        a1.add(2);
        a1.add(4);
        a1.add(3);


        a2.add(1);
        a2.add(2);
        a2.add(3);

        System.out.println(getMaxElementIndexes(a1, a2));
    }

    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        int maxIndex1 = findmax(a);
        Collections.sort(a);
        int maxIndex2 = findmax(a);
        int diff = maxIndex2 - maxIndex1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < rotate.size(); i++) {
            int rot = (rotate.get(i) % a.size());
            int ttt = maxIndex1 - rot;
            if (ttt < 0)
                ttt = ttt + a.size();
            result.add(ttt);


            int tt = maxIndex2 - diff;
            tt = tt - rot;
            if (tt < 1) {
                tt = maxIndex2;
            }
            int x = maxIndex2 - rot - diff;
            if (x < 1)
                x = a.size() + x;
           // result.add(tt);
            /*
            if (rot < maxIndex1)
                result.add(maxIndex1 - rot);
            else
                result.add(maxIndex1 + rot);*/
        }
        System.out.println("");
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
