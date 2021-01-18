package com.leetcode;

import java.util.Stack;

public class SymmetricTree {

    public static void main(String[] args) {

        TreeNode1 tn = new TreeNode1(1, new TreeNode1(2, new TreeNode1(3), new TreeNode1(4)), new TreeNode1(2, new TreeNode1(4), new TreeNode1(3)));
        TreeNode1 tn1 = new TreeNode1(1, new TreeNode1(2, null, new TreeNode1(3)), new TreeNode1(2, null, new TreeNode1(3)));
        TreeNode1 tn2 = new TreeNode1(1, new TreeNode1(2, null, new TreeNode1(3)), new TreeNode1(2, null, new TreeNode1(3)));


        System.out.println(">>" + isSymmetric(tn));
    }

    public static boolean isSymmetric(TreeNode1 root) {
        if (root == null)
            return true;
        Stack<Integer> stackl = recur(root.right, new Stack<>(), true);
        Stack<Integer> stackr = recur(root.left, new Stack<>(), false);
        try {
            while (!stackl.isEmpty()) {
                if (!stackl.pop().equals(stackr.pop()))
                    return false;
            }
        } catch (Exception e) {
            return false;
        }
        return stackr.isEmpty();
    }

    private static Stack<Integer> recur(TreeNode1 treeNode1, Stack<Integer> stack, boolean l) {
        if (treeNode1 == null) {
            stack.push(-1);
            return stack;
        } else {
            stack.push(treeNode1.val);
            if (l) {
                recur(treeNode1.left, stack, l);
                recur(treeNode1.right, stack, l);
            } else {
                recur(treeNode1.right, stack, l);
                recur(treeNode1.left, stack, l);
            }
        }
        return stack;
    }

    public static class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;

        TreeNode1() {
        }

        TreeNode1(int val) {
            this.val = val;
        }

        TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}