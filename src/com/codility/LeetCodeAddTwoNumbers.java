package com.codility;

public class LeetCodeAddTwoNumbers {


    public static void main(String[] args) {
        ListNode lll1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode lll2 = new ListNode(5, new ListNode(6));
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9));
        ListNode m = addTwoNumbers(l1, l2);
        while (m.next != null) {
            System.out.println(m.val);
            m = m.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode x = new ListNode(0);
        int i = 0;
        ListNode ll1 = l1;
        ListNode ll2 = l2;
        int parity = 0;
        ListNode nextingo = x;
        while (ll1 != null || ll2 != null) {
            i++;
            int v = ll1 == null ? 0 : ll1.val;
            int b = ll2 == null ? 0 : ll2.val;
            int yy = (v + b) + parity;
            nextingo.next = new ListNode(yy < 10 ? yy : yy % 10);
            nextingo = nextingo.next;
            parity = yy < 10 ? 0 : yy / 10;
            if (ll1 != null)
                ll1 = ll1.next;
            if (ll2 != null)
                ll2 = ll2.next;
        }
        if (parity > 0) {
            nextingo.next = new ListNode(parity);
        }
        return x.next;
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