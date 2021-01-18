package com.other;

public class Demo {

    public static void main(String[] args) {
        String[] x = {"1", "1", "2", "1", "1", "k", "3"};
        String[] x2 = {"2", "2", "2", "1", "2", "2", "1", "2", "2", "2", "k", "2"};
        String[] x3 = {"2", "4", "6", "k", "1"};
        String[] x4 = {"2", "1","2","1", "2","k", "2"};

        run(x4);
    }

    public static void run(String[] args) {
        int kValue = 0;
        int kIndex = 0;
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("k")) {
                kValue = Integer.valueOf(args[i + 1]);
                kIndex = i;
            }
        }

        for (int i = 1; i < args.length - 2; i++) {
            int oddCount = 0;
            int bitcount = 0;
            for (int ii = 0; ii < args.length - 2; ii++) {
                oddCount = 0;
                bitcount = 0;
                System.out.println();
                for (int iii = 0; iii < i; iii++) {
                    if (iii + ii < args.length && iii + ii < kIndex)
                        System.out.print(Integer.valueOf(args[iii + ii]) + ",");
                    if (iii + ii < args.length && iii + ii < kIndex && Integer.valueOf(args[iii + ii]) % 2 != 0) {
                        //System.out.print(">>>>>" + Integer.valueOf(args[iii + ii]) + ",");
                        oddCount++;
                    }
                    bitcount++;
                }
                if (oddCount == kValue && bitcount == i) {
                    System.out.println("increment!");
                    total++;
                }
            }
        }
        System.out.println(">>" + total);
    }

}
