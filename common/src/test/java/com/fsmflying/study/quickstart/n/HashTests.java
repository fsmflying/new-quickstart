package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class HashTests {

    @Before
    public void before(){

    }

    @After
    public void after(){

    }

    /**
     * Hashtable
     */
    @Test
    public void test_01(){
        Hashtable<String,Object> ht = new Hashtable<>();
        ht.put("A",'A');
        ht.put("B",'B');
        ht.put("C",'C');
        ht.put("D",'D');
        ht.put("E",'E');
        ht.put("F",'F');
        for (Map.Entry<String,Object> item:
             ht.entrySet()) {
            System.out.println(item.getKey()+":"+item.getValue());
        }


    }

    /**
     * hashset
     */
    @Test
    public void test_02(){
        HashSet<String> set01 = new HashSet<>();
        set01.add("A");
        set01.add("A");
        set01.add("A");
        set01.add("A");
        set01.add("B");
        set01.add("B");
        set01.add("C");
        set01.add("C");
        set01.add("D");
        set01.add(null);
        set01.add(null);
        Iterator<String> it = set01.iterator();
        String s ;
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * HashMap
     */
    @Test
    public void test_03(){
        Map<String,Object> hTable = new HashMap<>();
    }
}
