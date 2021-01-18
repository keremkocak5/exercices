package com.codility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Stack;

public class Main26 {

    public static void main(String[] args) {
        int[] x = {5, 4, 3, 2, 1, 6, 7};
        int[] y = {0, 0, 0, 0, 1, 0, 0};

        int m = solution(x, y);
        //int z = solution(x);
        System.out.println(m);
    }

    public static int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (B[stack.peek()] == 1 && B[stack.peek()] != B[i]) {
                if (A[stack.peek()] > A[i]) {
                    // nothing
                } else {
                    stack.pop();
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }
        return stack.size();
    }

    public class FishTests {



        @DataProvider(name = "test1")
        public Object[][] createData1() {
            return new Object[][]{
                    new Object[]{new int[]{4, 3, 2, 1, 5}, new int[]{1, 0, 1, 0, 1}, 3},
                    new Object[]{new int[]{4, 3, 2, 0, 5}, new int[]{0, 1, 0, 0, 0}, 2},
                    new Object[]{new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}, 2},
                    new Object[]{new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 1, 0, 0}, 2},
                    new Object[]{new int[]{4, 3, 2, 5, 6}, new int[]{1, 0, 1, 0, 1}, 2},
                    new Object[]{new int[]{7, 4, 3, 2, 5, 6}, new int[]{0, 1, 1, 1, 0, 1}, 3},
                    new Object[]{new int[]{3, 4, 2, 1, 5}, new int[]{1, 0, 0, 0, 0}, 4},
                    new Object[]{new int[]{3}, new int[]{1}, 1},
                    new Object[]{new int[]{3}, new int[]{0}, 1},
            };
        }

        @Test(dataProvider = "test1")
        public void verifySolution(int[] pA, int[] pB, int pExpected) {
            Assert.assertEquals(solution(pA, pB), pExpected);
        }
    }
}



