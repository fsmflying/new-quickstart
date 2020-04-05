package com.fsmflying.study.quickstart.n;

import org.junit.Test;

public class StringTests {

    @Test
    public void test_01(){
        Integer i=10;
        System.out.println(i.toString());
        System.out.println(0xffffffff);
        System.out.println(0xffffffff>>1);
        System.out.println(0xffffffff>>>1);
        System.out.println(0x7fffffff>>>1);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(0x00f0<<3>>>4));
        System.out.println(Integer.toBinaryString(0xffffffff));
        System.out.println(Integer.toBinaryString(0xffffffff>>>4));

    }
}
