package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final ExecutorService tpe = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int n = 0; n < 10; n++)
            tpe.submit(() -> {
                Thread thread = Thread.currentThread();
                for (int i = 0; i < 10_000; i++)
                    System.out.printf("[%s - %s] %s%n", thread.getId(), thread.getName(), i);
            });
        // tpe.shutdown();
        // System.out.println(tpe.awaitTermination(10, TimeUnit.MINUTES));
    }

}
