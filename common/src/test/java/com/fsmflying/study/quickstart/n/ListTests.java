package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class ListTests {

    public static List<String> slist = new ArrayList<String>();

    @Before
    public void before(){
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

    <T> void print(List<T> list){
        System.out.println("******************************************");
        for (Object o :
                list) {
            System.out.println(o);
        }
    }

    @After
    public void after(){

    }

    @Test
    public void test_01(){
//        for (int i = 0; i < slist.size(); i++) {
//            System.out.println(slist.get(i));
//        }
        print(slist);
        Collections.sort(slist);
        print(slist);

    }

    @Test
    public void test_LinkedList(){
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        list.add("K");
        list.add("L");
        list.add("M");
        list.add("N");
        list.add("O");

        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        print(list);
        Collections.sort(list);
        print(list);
    }
}
