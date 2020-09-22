package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

public class MemoryAllocateTests {
    @Before
    public void before(){

    }

    @After
    public void after(){

    }

    @Test
    public void test_01_Object(){
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
