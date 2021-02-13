package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CapitalOne4 {
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

        System.out.println(minimumSwaps(a1));
    }

    public static int minimumSwaps(List<Integer> popularity) {
        int swapCount = 0;
        for (int i = 0; i < popularity.size() - 1; i++) {
            if (popularity.get(i) == i + 1) continue;
            swapCount++;
            int tmp = popularity.get(i);
            popularity.set(i, popularity.get(tmp - 1));
            popularity.set(tmp - 1, tmp);
            i--;
        }
        return swapCount;
    }
}
