package com.codility;

public class Main {

    public static void main(String[] args) {
        int x = sol(Integer.toBinaryString(32));
        System.out.println(x);
    }

        public static int sol(String n) {
            boolean reset = false;
            int max = 0;
            int i = 0;
            int sifir1 = 0;
            while (i < n.length()) {
                i = 0;
                if (n.substring(i, i+1).equals("1")) {
                    sifir1 = sifir(n.substring(i + 1, n.length()));
                }
                i = i + sifir1;
                if (i+1 < n.length() &&  n.substring(i+1, i+2).equals("1")) {
                    max = Integer.max(max, sifir1);
                }
                n = n.substring(i+1, n.length());
            }
            return max;
        }

        public static int sifir(String sifir) {
            int max = 0;
            for (int i = 0; i < sifir.length()-1; i++) {
                if ( sifir.substring(i, i+1).equals("1")) {
                    return max;
                }
                if (sifir.substring(i, i+1).equals("0")) {
                    max = max + 1;
                }
            }
            return max;
        }
}