package com.fsmflying.study.quickstart.n;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTests {

    @Before
    public void before() {

    }

    @After
    public void after() {

    }


    public void printMap(Map<String, ? extends Object> map) {
        if (null != map) {
            for (Map.Entry<String, ? extends Object> item : map.entrySet()
            ) {
                System.out.println(item.getKey() + ":" + item.getValue().toString());
            }
        }
    }

    @Test
    public void test_01() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.put("B", "B");
        map.put("C", "C");
        map.put("D", "D");

        printMap(map);
    }

    static final int MAXIMUM_CAPACITY = 1 << 30;

    int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    @Test
    public void test_02() {

        System.out.println(tableSizeFor(-1));//-1
        System.out.println(tableSizeFor(0x00000));//0
        System.out.println(tableSizeFor(0b00001));//1
        System.out.println(tableSizeFor(0b00011));//3
        System.out.println(tableSizeFor(0b00111));//7
        System.out.println(tableSizeFor(0b01111));//15
        System.out.println(tableSizeFor(0b11111));//31
        Integer i = new Integer(33);
    }

    @Test
    public void test_03() {
        Map<String, Object> map01 = new ConcurrentHashMap<>();
        map01.put("A", 1);
        map01.put("B", 2);
        map01.put("C", 2);
        map01.put("D", 2);
        map01.put("E", 2);
        map01.put("F", 2);
    }

    @Test
    public void test_04() {
        System.out.println(0b01 ^ 0b10);
    }

    @Test
    public void test_treemap() {
        System.out.println(0b01 ^ 0b10);
        TreeMap<String,Integer> treeMap = new TreeMap<>();
    }

}
