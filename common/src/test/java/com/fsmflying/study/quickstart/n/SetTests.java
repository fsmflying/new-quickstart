package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTests {

    Set<String>  v = new HashSet<>();

    @Before
    public void before(){
        v.add("A");
        v.add("B");
        v.add("C");

        v.add("G");
        v.add("H");
        v.add("I");

        v.add("D");
        v.add("E");
        v.add("F");

        v.add("D");
        v.add("D");
        v.add("D");
    }

    @After
    public void after(){

    }

    @Test
    public void test_01(){
        for (String s:v) {
            System.out.println(s);
        }
    }

    @Test
    public void test_tree(){

        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("A");
        ts1.add("B");
        ts1.add("E");
        ts1.add("F");
        ts1.add("C");
        ts1.add("D");


    }
}
