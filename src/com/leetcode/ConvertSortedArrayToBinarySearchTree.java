package com.leetcode;

public class ConvertSortedArrayToBinarySearchTree {


    public static void main(String[] args) {

        SymmetricTree.TreeNode1 tn = new SymmetricTree.TreeNode1(1, new SymmetricTree.TreeNode1(2, new SymmetricTree.TreeNode1(3), new SymmetricTree.TreeNode1(4)), new SymmetricTree.TreeNode1(2, new SymmetricTree.TreeNode1(4), new SymmetricTree.TreeNode1(3)));
        SymmetricTree.TreeNode1 tn1 = new SymmetricTree.TreeNode1(1, new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)), new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)));
        SymmetricTree.TreeNode1 tn2 = new SymmetricTree.TreeNode1(1, new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)), new SymmetricTree.TreeNode1(2, null, new SymmetricTree.TreeNode1(3)));
        int[] iki = new int[]{0, 1, 2, 3, 4, 5};

        System.out.println(sortedArrayToBST(iki));
    }

    public static SymmetricTree.TreeNode1 sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public static SymmetricTree.TreeNode1 sortedArrayToBST(int[] nums, int x, int y) {
        if (x > nums.length - 1)
            return null;
        if (y == 0)
            return new SymmetricTree.TreeNode1(nums[0]);
        if (y < 0)
            return null;
        int center = x + y / 2;
        SymmetricTree.TreeNode1 tr1 = new SymmetricTree.TreeNode1(nums[center]);
        tr1.left = sortedArrayToBST(nums, x, center - 1);
        tr1.right = sortedArrayToBST(nums, center + 1, y);
        return tr1;
    }

    public static SymmetricTree.TreeNode1 sortedArrayToBST3(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int center = nums.length / 2;
        SymmetricTree.TreeNode1 tr1 = new SymmetricTree.TreeNode1(nums[center]);
        tr1.left = rleft(tr1, nums, center - 1);
        tr1.right = rright(tr1, nums, center + 1);
        return tr1;
    }

    public static SymmetricTree.TreeNode1 rleft(SymmetricTree.TreeNode1 tr1, int[] nums, int count) {
        if (count < 0)
            return null;
        count = count - 1;
        return new SymmetricTree.TreeNode1(nums[count + 1], rleft(tr1, nums, count), null);
    }

    public static SymmetricTree.TreeNode1 rright(SymmetricTree.TreeNode1 tr1, int[] nums, int count) {
        if (count > nums.length - 1)
            return null;
        count = count + 1;
        return new SymmetricTree.TreeNode1(nums[count - 1], null, rright(tr1, nums, count));
    }

    public static SymmetricTree.TreeNode1 sortedArrayToBST2(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int center = nums.length / 2;
        SymmetricTree.TreeNode1 tr1 = new SymmetricTree.TreeNode1(nums[center]);
        if (nums.length > 1) {
            tr1.left = sortedArrayToBST(nums, 0, center - 1, tr1, true);
            if (nums.length > 2)
                tr1.right = sortedArrayToBST(nums, center + 1, nums.length - 1, tr1, false);
        }
        return tr1;
    }

    public static SymmetricTree.TreeNode1 sortedArrayToBST(int[] nums, int a, int b, SymmetricTree.TreeNode1 treeNode1, boolean l) {
        /*if (b - a < 1)
            return new SymmetricTree.TreeNode1(nums[Math.min(a, b)]);*/
        int center = (b - a) % 2 == 0 ? a + (b - a) / 2 : a + (b - a) / 2 + 1;
        if (!l)
            center = a + (b - a) / 2;
        if (l && b == 0)
            return new SymmetricTree.TreeNode1(nums[0]);
        if (!l && a >= nums.length - 1)
            return new SymmetricTree.TreeNode1(nums[nums.length - 1]);
        ;
        SymmetricTree.TreeNode1 tr1 = new SymmetricTree.TreeNode1(nums[center]);
        if (l)
            tr1.left = sortedArrayToBST(nums, 0, center - 1, tr1, l);
        else
            tr1.right = sortedArrayToBST(nums, center + 1, nums.length - 1, tr1, l);
        return tr1;
    }


    private static int max(SymmetricTree.TreeNode1 root, int d) {
        if (root == null)
            return d;
        return Math.max(max(root.left, d + 1), max(root.right, d + 1));

    }


}