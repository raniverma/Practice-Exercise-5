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
    public void studentDataSort() {
        Student obj1 = new Student(2,"pratima", 11);
        Student obj2 = new Student(1,"alice",20);
        Student obj3 = new Student(4,"pratima",22);
        Student obj4 = new Student(3,"rani",22);
        Student obj5 = new Student(5,"pratima",25);

        List<Student> list=new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<Student> ans=obj.StudentData(list);
        String expected="",actual="";
        for(int i=0;i<list.size();i++) {
             expected+=list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" ";
        }
        for(int j=0;j<ans.size();j++){
            actual+=ans.get(j).getId()+" "+ans.get(j).getName()+" "+ans.get(j).getAge()+" ";

        }
        assertEquals(expected,actual);
    }

    @Test
    public void  CheckNullCase(){
        List<Student> list=new ArrayList<Student>();
        assertNull(obj.StudentData(list));
    }
}