package com.fsmflying.study.quickstart.n;

import org.junit.Test;

import java.math.BigDecimal;

public class EqualsTests {
    /**
     * int equals
     */
    @Test
    public void test_01_equals() {
        Integer i = 3;
        Integer j = 3;
        System.out.println(i == j);

        Integer m = new Integer(3);
        Integer n = new Integer(3);
        System.out.println(m == n);
        System.out.println(m.equals(n));
        System.out.println(i == m);
    }

    /**
     * float equals
     */
    @Test
    public void test_02_Float() {
        float f1 = 1.0f;
        float f2 = 0.9f;
        float f3 = 0.8f;
        System.out.println("##############");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("##############");
        System.out.println(f1 - f2);
        System.out.println(f1 - f2);
        System.out.println("##############");
        System.out.println(f2 - f3);
        System.out.println(f2 - f3);
        System.out.println("##############");
        System.out.println(f1 - f2 == f2 - f3);

        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");
        BigDecimal b3 = new BigDecimal("0.8");


    }

    /**
     * BigDecimal equals
     */
    @Test
    public void test_03_BigDecimal() {
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");
        BigDecimal b3 = new BigDecimal("0.8");

        System.out.println("##############");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("##############");
        System.out.println(b1.subtract(b2));
        System.out.println(b1.subtract(b2));
        System.out.println("##############");
        System.out.println(b2.subtract(b3));
        System.out.println(b2.subtract(b3));
        System.out.println("##############");
        System.out.println(b1.subtract(b2) == b1.subtract(b2));
        System.out.println(b1.subtract(b2).equals(b1.subtract(b2)));

        BigDecimal b4 = new BigDecimal("3.1415926535");
        System.out.println(b4);
        BigDecimal b5 = b4.setScale(3,BigDecimal.ROUND_HALF_DOWN);
        System.out.println("scale[3]:" + b5);
    }

}
