package com.codility;

public class Main15 {

    public static void main(String[] args) {
        String m = solution("?a??b?");
        //int z = solution(x);
        System.out.println(m);
    }

    public static String solution(String riddle) {
        if (riddle == null)
            return riddle;
        String[] x = new String[riddle.length()];
        for (int i = 0; i < riddle.length(); i++)
            x[i] = riddle.charAt(i) + "";
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("?")) {
                try {
                    if (i > 0) {
                        x[i] = x[i - 1].equals("b") ? "a" : "b";
                    }
                    if (i > 0 && x[i + 1].equals(x[i])) {
                        x[i] = x[i + 1].equals("b") ? "c" : "a";
                    } else if (i == 0) {
                        x[i] = x[i + 1].equals("b") ? "a" : "b";
                    }
                } catch (Exception e) {
                }
            }
        }
        String total = new String();
        for (String xx : x)
            total = total.concat(xx);
        return total;



        /*
        if (riddle == null || riddle.indexOf('?') == -1) {
            return riddle;
        }
        StringBuilder sb = new StringBuilder("");
        char prev = '\0';
        for (int i = 0; i < riddle.length(); i++) {
            char current = riddle.charAt(i);
            if (current == '?') {
                char next = '\0';
                if (i != riddle.length() - 1) {
                    next = riddle.charAt(i + 1);
                }
                current = prev != 'a' && next != 'a' ? 'a'
                        : prev != 'b' && next != 'b' ? 'b'
                        : 'c';
            }
            sb.append(current);
            prev = current;
        }
        return sb.toString();*/
    }

}