package com.hackerrank;

import java.util.Arrays;

public class FraudulentActivityNotifications {
    private static int[] bir = new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};
    private static int[] bir1 = new int[]{10, 20, 30, 40, 50};
    private static int[] bir2 = new int[]{1, 2, 3, 4, 4};


    public static void main(String[] args) {
        System.out.println(activityNotifications(bir, 4));
    }

    // Complete the maximumToys function below.
    static int activityNotifications(int[] expenditure, int d) {
        int[] e2 = expenditure.clone();
        Arrays.sort(e2);
        int fraudCount = 0, total = 0;
        for (int i = 0; i < expenditure.length - d - (d % 2 == 0 ? 1 : 0); i++) {
            if (expenditure[i + d] >= 2 * getMedian(e2, d, i)) {
                System.out.println(">>>" + i + "," + d);
                fraudCount++;
            }
        }
        return fraudCount;
    }

    private static double getMedian(int[] expenditure, int d, int index) {
        if (d % 2 == 0) {
            return (expenditure[d / 2 + index] + expenditure[d + index + 1]) / 2.0;
        } else {
            return expenditure[d / 2 + index];
        }
    }

}