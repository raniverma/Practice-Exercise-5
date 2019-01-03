package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTest{

    public List<Student> StudentData(List<Student> list) {
        if(list.size()==0)
            return null;

        Collections.sort(list,new StudentSorter());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId() +" "+ list.get(i).getName()+" "+list.get(i).getAge());
        }
        return list;
    }
}
