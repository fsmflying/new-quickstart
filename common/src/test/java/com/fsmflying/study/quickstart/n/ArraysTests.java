package com.fsmflying.study.quickstart.n;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArraysTests {

    @Test
    public void test_01_Arrays() {
        String[] fruits = {"Apple", "Orange", "Banana", "Tomato"};
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);

        int[] myArray = {1, 2, 3};
        List myList = Arrays.asList(myArray);
        System.out.println(myList.size());//1
        System.out.println(myList.get(0));//数组地址值
        System.out.println(myList.get(0).getClass().getName());//数组地址值
//        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
        int[] array = (int[]) myList.get(0);
        System.out.println(array[0]);//1


    }

    public static void printArray(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    @Test
    public void test_02_SystemCopy() {
        int[] a1 = new int[3];
        a1[0] = 'a';
        a1[1] = 'b';
        a1[2] = 'c';
        int[] a2 = new int[3], a3 = new int[3], a4 = new int[3], a5 = new int[3];
        System.arraycopy(a1, 0, a2, 0, 1);
        System.arraycopy(a1, 0, a3, 0, 2);
        System.arraycopy(a1, 0, a4, 0, 3);
        System.arraycopy(a1, 0, a4, 0, 5);

        System.out.println("****[a1]***************");
        printArray(a1);
        System.out.println("****[a2]***************");
        printArray(a2);
        System.out.println("****[a3]***************");
        printArray(a3);
        System.out.println("****[a4]***************");
        printArray(a4);
        System.out.println("****[a5]***************");
        printArray(a5);


    }

    @Test
    public void test_02_ArraysCopy() {
        int[] a1 = new int[3];
        a1[0] = 'a';
        a1[1] = 'b';
        a1[2] = 'c';
        int[] a2 = new int[3], a3 = new int[3], a4 = new int[3], a5 = new int[3];
        Arrays.copyOf(a1,10);
//        System.arraycopy(a1, 0, a3, 0, 2);
//        System.arraycopy(a1, 0, a4, 0, 3);
//        System.arraycopy(a1, 0, a4, 0, 5);

        System.out.println("****[a1]***************");
        printArray(a1);
        System.out.println("****[a2]***************");
        printArray(a2);
        System.out.println("****[a3]***************");
        printArray(a3);
        System.out.println("****[a4]***************");
        printArray(a4);
        System.out.println("****[a5]***************");
        printArray(a5);


    }
}
