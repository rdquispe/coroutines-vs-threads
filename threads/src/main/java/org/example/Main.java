package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        IntStream range = IntStream.range(0, 200000);

        range.forEach(index -> {
            Thread thread = new Thread(() -> {
                System.out.printf("Job java thread: %d%n", index);
            });

            thread.start();
        });

        long finish = System.currentTimeMillis();
        long totalTime = finish - start;

        System.out.printf("Finish in: %d%n seconds", (totalTime / 1000));
    }
}