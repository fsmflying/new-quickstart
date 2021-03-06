package com.fsmflying.study.quickstart.n.thread;

public class ThreadStartup {

    public static void main(String[] args) {


        //创建线程方式1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        });
        t1.start();

        //创建线程方式2
        Thread t2 = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("t2");
            }
        };
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main");




    }


}
