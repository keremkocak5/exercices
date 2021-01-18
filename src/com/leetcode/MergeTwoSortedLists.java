package com.leetcode;


public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        mergeTwoLists(l1, l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int c1 = 0;
        int c2 = 0;
        ListNode n1 = l1, n2 = l2, l3 = new ListNode(),  l4 = l3;
        while (true) {
            if (n1 == null || n2 == null)
                break;
            if (n1.val == n2.val) {
                l3.next = new ListNode(n1.val, new ListNode(n2.val));
                l3 = l3.next;
                l3 = l3.next;
                n1 = n1.next;
                n2 = n2.next;
            } else if (n1.val < n2.val) {
                l3.next = new ListNode(n1.val);
                l3 = l3.next;
                n1 = n1.next;
            } else if (n1.val > n2.val) {
                l3.next = new ListNode(n2.val);
                l3 = l3.next;
                n2 = n2.next;
            }
        }
        while (true) {
            if (n1 == null && n2 == null)
                break;
            if (n1 != null) {
                l3.next = new ListNode(n1.val);
                l3 = l3.next;
                n1 = n1.next;
            } else if (n2 != null) {
                l3.next = new ListNode(n2.val);
                l3 = l3.next;
                n2 = n2.next;
            }
        }

        return l4 != null ? l4.next : new ListNode();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}