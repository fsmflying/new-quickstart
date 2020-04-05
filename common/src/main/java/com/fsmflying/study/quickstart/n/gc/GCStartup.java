package com.fsmflying.study.quickstart.n.gc;

public class GCStartup {
    public static final int  _1MB=1024*1024;
    /**
     * vm参数：
     * -verbose:gc
     * -Xms10m -Xmx20M -Xmn10M -XX:+PrintGCDetails
     * -XX:SurvivorRatio=8
     * /

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        test_01_EdenMemoty();
    }

    static void test_01_EdenMemoty(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];

    }
    static void test_02_Tenuring(){

    }
}
