package com.fsmflying.study.quickstart.n;

import lombok.Data;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CollectionTests {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

    @Data
    public class Person implements Comparator<String>{
        String name;
        Date birthdate;

        public Person() {

        }

        public Person(String name, Date birthdate) {
            this.name = name;
            this.birthdate = birthdate;
        }

        @Override
        public String toString() {
            return "Person[name=" + name + ",birthdate=" + sdf.format(birthdate) + "]";
        }

        public int compareToByName(Person another) {
            if (another == null||another.name==null) return -1;
            if(this.name==null) return 1;
            return this.name.compareTo(another.name);
        }

        public int compareToByBirthdate(Person another) {
            if(another==null || another.birthdate == null) return -1;
            if(this.birthdate==null) return 1;
            if (another.birthdate.equals(this.birthdate)) return 0;
            return this.birthdate.before(another.birthdate) ? -1 : 1;
        }

        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    }

    public void print(List<Person> list) {
        if (list != null) {
            for (Person p : list) {
                System.out.println(p);
            }
        }
    }


    List<Person> personList = new ArrayList<>(10);

    @Before
    public void before() {
        try {
            personList.add(new Person("F", sdf.parse("1980-01-06")));
            personList.add(new Person("G", sdf.parse("1980-01-07")));
            personList.add(new Person("H", sdf.parse("1980-01-08")));
            personList.add(new Person("I", sdf.parse("1980-01-09")));
            personList.add(new Person("J", sdf.parse("1980-01-10")));

            personList.add(new Person("A", sdf.parse("1980-01-01")));
            personList.add(new Person("B", sdf.parse("1980-01-02")));
            personList.add(new Person("C", sdf.parse("1980-01-03")));
            personList.add(new Person("D", sdf.parse("1980-01-04")));
            personList.add(new Person("E", sdf.parse("1980-01-05")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    @After
    public void after() {

    }

    @Test
    public void test_01() {
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                //return p1 != null && p2 != null && p1.getBirthdate().after(p2.getBirthdate());
                return p1.compareToByBirthdate(p2);
            }
        });
//        Collections.sort(list);

        print(personList);


    }
}
