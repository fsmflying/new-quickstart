package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

public class CompareTests {

    @Before
    public void before(){

    }

    @After
    public void after(){

    }

    public static class Person implements Comparable<Person>{

        @Override
        public int compareTo(Person another) {
            return 0;
        }
    }

    public static class Fruit implements Comparable<Fruit>{

        @Override
        public int compareTo(Fruit another) {
            return 0;
        }
    }

    /**
     *
     */
    @Test
    public void test_01(){
    }
}
