package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ObjectTests {


    @Before
    public void before(){
    }

    @After
    public void after(){

    }

    static class TestObjectSize {
        int a;
        long b;
        static int c;
    }

    @Test
    public void test_01() throws IOException {
        TestObjectSize testObjectSize = new TestObjectSize();
        // 打印对象的shallow size
//        System.out.println("Shallow Size: " + MemoryUtil.memoryUsageOf(testObjectSize) + " bytes");
        // 打印对象的 retained size
//        System.out.println("Retained Size: " + MemoryUtil.deepMemoryUsageOf(testObjectSize) + " bytes");
        System.in.read();
    }
}



