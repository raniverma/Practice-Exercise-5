package com.stackroute.pe5;

import java.util.Iterator;
import java.util.List;

public class UpdateElement {
    public List<String> UpdateElements(List<String> input, String value,int index) {
        if(input.size()==0)
            return null;
       input.set(index,value);
       input.clear();
        System.out.println("After removing all elements list is:"+ input);
        return input;
    }
}
