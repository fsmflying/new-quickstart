package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTests {

    @Before
    public void before(){

    }

    @After
    public void after(){

    }

    @Test
    public void test_01(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
    }
}
