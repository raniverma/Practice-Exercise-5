package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest obj;
    @Before
    public void setUp() throws Exception {
        obj=new MainTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void studentData() {
        Student obj1 = new Student(1,"pratima", 22);
        Student obj2 = new Student(2,"pratima",22);
        Student obj3 = new Student(3,"pratima",22);
        Student obj4 = new Student(4,"pratima",22);
        Student obj5 = new Student(5,"pratima",22);

        List<Student> list=new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        assertEquals(list,obj.StudentData());
    }
}