package com.hackerrank;

public class NewYearChaos {
    private static int[] bir = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
    private static int[] iki = new int[]{5, 1, 2, 3, 7, 8, 6, 4};

    public static void main(String[] args) {
        minimumBribes(bir);
    }


    static void minimumBribes(int[] q) {
        int sequence = 1, bribeCount = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] == sequence) {
                // all ok!
            } else if (q[i] == sequence + 1) {
                // bribe
                bribeCount++;
            } else if (q[i] == sequence + 2) {
                // double bribe
                bribeCount++;
                bribeCount++;
            } else if (q[i] > sequence + 2) {
                System.out.println(q[i] - sequence);
                System.out.println("Too chaotic");
            }
            sequence++;
        }
        System.out.println(bribeCount);
    }
}