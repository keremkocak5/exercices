package com.codility;

public class Main20 {

    private static char[][] board = {
            {'q', 'w', 'e', 'r', 't', 'y'},
            {'a', 's', 'd', 'f', 'g', 'h'},
            {'z', 'x', 'c', 'v', 'b', 'n'},
            {'u', 'u', 'a', 'd', 'p', 'r'},
            {'g', 'f', 't', 'b', 'a', 'g'},
            {'o', 'o', 'f', 't', 's', 'g'}
    };

    public static void main(String[] args) {
        boolean m = solution("wer");
        System.out.println(m);
    }


    public static boolean solution(String N) {
        return true;
    }


    public static boolean solution2(String N) {
        String genel = new String();
        String menel = new String();
        for (int i = 0; i < board.length; i++) {
            for (int ii = 0; ii < board[i].length; ii++) {
                genel = genel.concat(board[i][ii] + "");
                menel = menel.concat(board[ii][i] + "");
            }
            genel = genel.concat(" ");
            menel = menel.concat(" ");
        }
        System.out.println(genel.toString());
        System.out.println(menel.toString());
        if (genel.contains(N))
            return true;
        if (menel.contains(N))
            return true;
        return false;
    }
}



