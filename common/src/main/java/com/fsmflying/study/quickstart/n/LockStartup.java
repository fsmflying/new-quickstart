package com.fsmflying.study.quickstart.n;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class LockStartup {

    private static int m = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    m++;
                }
                latch.countDown();
            });
        }
        Arrays.stream(threads).forEach((t)->t.start());
        latch.await();
        System.out.println(m);
    }


}
