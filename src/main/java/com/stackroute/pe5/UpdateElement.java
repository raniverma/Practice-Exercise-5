/*Update Element Class*/
package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateElement {
    public List<String> UpdateElements(List<String> input, String value,int index) {
        //input list is null
        if(input.size()==0)
            return null;
        //ArrayIndexOutOfBound
        else if(index>input.size())
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
               // List<String> list=new ArrayList<String>();
            }
        //otherwise
            input.set(index, value);
            List<String> newList = new ArrayList<String>();
            for (int i = 0; i < input.size(); i++) {
                newList.add(input.get(i));
            }
            input.clear();
            System.out.println("After removing all elements list is:" + input);
            return newList;
    }
}
