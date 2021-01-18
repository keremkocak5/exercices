package com.codility;

import java.util.HashMap;
import java.util.stream.Stream;

public class Main14 {

    public static void main(String[] args) {
        int[] x = {10, 50, 5, 1};
        //int z = solution(x);
        //System.out.println(z);
    }

    public static Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending, Stream<Stream<ProcessedTransaction>> processed) {
        Stream<PendingTransaction> result = null;

        HashMap<String, String> hm = new HashMap<>();

        //hm = processed.collect(PendingTransaction::getId, PendingTransaction::getStatus);

        return result;
    }
}