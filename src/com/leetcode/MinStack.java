package com.leetcode;

import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class MinStack {


    private Stack<Integer> stack = new Stack<>();
    private SortedMap<Integer, Integer> sp = new TreeMap<>();

    public static void main(String[] args) {
        //ln.val = 3;

        //System.out.println(hasCycle(bir));
    }


    public void push(int x) {
        stack.push(x);
        if (sp.containsKey(x))
            sp.put(x, sp.get(x) + 1);
        else
            sp.put(x, 1);
    }

    public void pop() {
        int m = stack.pop();
        if (sp.containsKey(m) && sp.get(m) == 1)
            sp.remove(m);
        else if (sp.containsKey(m))
            sp.put(m, sp.get(m) - 1);
    }

    public int top() {
        return stack.elementAt(stack.size() - 1);
    }

    public int getMin() {
        return sp.firstKey();
    }

}