package com.fsmflying.study.quickstart.n.gc;

public class BigObjectGCStartup {
    public static final int _1MB = 1024 * 1024;

    /**
     * vm参数：
     * -verbose:gc
     * -Xms10m -Xmx20M -Xmn10M -XX:+PrintGCDetails
     * -XX:PretenureSizeThreshold=3145728
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[4 * _1MB];
    }
}
