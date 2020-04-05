package com.fsmflying.study.quickstart.n.thread;

public class ThreadStartup {

    public static void main(String[] args) {


        //创建线程方式1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        t1.start();

        //创建线程方式2
        Thread t2 = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
        t2.start();




    }


}
