package com.favrizzio.practicas.executorfr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFr {

    private static ExecutorService executor = null;
    private static volatile Future<?> taskOneResults = null;

    static Integer a = 0;

    public static void main(String[] args) {

        executor = Executors.newFixedThreadPool(10);

        while (!executor.isTerminated()) {
            try {
                checkTasks();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void checkTasks() throws Exception {
        if (taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled()) {

            for (int i = 1; i <= 20; i++) {

                a++;

                if (a >= 20) {
                    taskOneResults = executor.submit(new TestOne(i + a));
                } else {
                    taskOneResults = executor.submit(new TestOne(i));
                }
                
                if (a > 1000){
                    executor.shutdownNow();
                }

            }
        }
    }
}

class TestOne implements Runnable {

    private Integer num;

    public TestOne(int i) {
        this.num = i;
    }

    public void run() {
        System.out.println("Executing task " + this.num);
    }
}