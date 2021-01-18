package com.leetcode;

public class MaximumDepthOfBinaryTree {


    public static void main(String[] args) {

        SymmetricTree.TreeNode1 tn = new SymmetricTree.TreeNode1(1, new SymmetricTree.TreeNode1(2, new SymmetricTree.TreeNode1(3), new SymmetricTree.TreeNode1(4)), new SymmetricTree.TreeNode1(2, new SymmetricTree.TreeNode1(4), new SymmetricTree.TreeNode1(3)));
        SymmetricTree.TreeNode1 tn1 = new SymmetricTree.TreeNode1(1, new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)), new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)));
        SymmetricTree.TreeNode1 tn2 = new SymmetricTree.TreeNode1(1, new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)), new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)));
        System.out.println(maxDepth(tn));
    }

    public static int maxDepth(SymmetricTree.TreeNode1 root) {
        return max(root, 0);
    }

    private static int max(SymmetricTree.TreeNode1 root, int d) {
        if (root == null)
            return d;
        return Math.max(max(root.left, d + 1), max(root.right, d + 1));

    }


}