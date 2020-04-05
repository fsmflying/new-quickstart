package com.fsmflying.study.quickstart.n;

import org.openjdk.jol.info.ClassLayout;

import java.util.Date;

public class MemoryAllocateStartup {
    static class User {
        private String username;
        private String password;
        private Date birthdate;


        public User(String username, String password, Date birthdate) {
            this.username = username;
            this.password = password;
            this.birthdate = birthdate;
        }
    }
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        User u1 = new User(null,"123456",new Date());
        User u2 = new User("fang","123456",new Date());
        User u3 = new User("fangming","123456",new Date());
        System.out.println(ClassLayout.parseInstance(u1).toPrintable());
        System.out.println(ClassLayout.parseInstance(u2).toPrintable());
        System.out.println(ClassLayout.parseInstance(u3).toPrintable());


    }
}
