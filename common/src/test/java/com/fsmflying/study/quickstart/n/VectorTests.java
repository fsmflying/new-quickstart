package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class VectorTests {

    @Before
    public void before(){

    }

    @After
    public void after(){

    }

    @Test
    public void test_01(){
        Vector<String> slist  = new Vector<>();
        slist.add("A");
        slist.add("B");
        slist.add("C");

        slist.add("G");
        slist.add("H");
        slist.add("I");

        slist.add("D");
        slist.add("E");
        slist.add("F");

        slist.add("D");
        slist.add("D");
        slist.add("D");

    }
}
