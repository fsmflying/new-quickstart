package com.fsmflying.study.quickstart.n.thread;

public class JoinStartup {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("t2");
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(5*1000);
            //t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main");




    }
}
