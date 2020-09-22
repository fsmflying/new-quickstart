package com.fsmflying.study.quickstart.n;

import org.openjdk.jol.info.ClassLayout;

import java.util.Date;
/**
 * 对象内存分配
 * -XX:-UseCompressedOops 不使用压缩对象指针
 * -XX:+UseCompressedOops 使用压缩对象指针（默认)
 * -XX:-UseCompressedClassPointers 不使用压缩类指针
 * -XX:+UseCompressedClassPointers 使用压缩类指针（默认)
 *
 */
public class MemoryAllocateStartup {
    static class User {
        private String username;
        private String password;
        private Date birthdate;
        private int sex = 0;
        public User(String username, String password, Date birthdate) {
            this.username = username;
            this.password = password;
            this.birthdate = birthdate;
        }
    }

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        User u1 = new User(null, "123456", new Date());
//        User u2 = new User("fang", "123456", new Date());
//        User u3 = new User("fangming", "123456", new Date());
//        System.out.println(ClassLayout.parseInstance(u1).toPrintable());
//        System.out.println(ClassLayout.parseInstance(u2).toPrintable());
//        System.out.println(ClassLayout.parseInstance(u3).toPrintable());
//
//        User[] users = new User[10];
////        users[0] = u1;
////        users[1] = u2;
////        users[2] = u3;
//        System.out.println(ClassLayout.parseInstance(users).toPrintable());
//
//        int[] arrayOfInt = new int[3];
//        arrayOfInt[0]=1;
//        arrayOfInt[1]=2;
//        System.out.println(ClassLayout.parseInstance(arrayOfInt).toPrintable());
//
//        Integer[] arrayOfInteger = new Integer[3];
//        arrayOfInteger[0]=1;
//        arrayOfInteger[1]=2;
//        System.out.println(ClassLayout.parseInstance(arrayOfInteger).toPrintable());
//
//        BigDecimal[] arrayOfBigDecimal = new BigDecimal[3];
//        arrayOfBigDecimal[0]=new BigDecimal(0);
//        arrayOfBigDecimal[1]=new BigDecimal(1);
//        System.out.println(ClassLayout.parseInstance(arrayOfBigDecimal).toPrintable());



    }
}
