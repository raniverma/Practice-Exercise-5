package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountFrequency {

    public Map<String,Integer> CountFreqOfWords(String str){
    //    str = "one one -one___two,,three,one @three*one?two";
        String regexForOne="one";
        String regexForTwo="two";
        String regexForThree="three";
        Pattern pattern1=Pattern.compile(regexForOne);
        Pattern pattern2=Pattern.compile(regexForTwo);
        Pattern pattern3=Pattern.compile(regexForThree);
        Matcher match1=pattern1.matcher(str);
        Matcher match2=pattern2.matcher(str);
        Matcher match3=pattern3.matcher(str);
        int count1=0;
        while(match1.find()){
            count1++;
        }
        System.out.println(count1);
        int count2=0;
        while(match2.find()){
            count2++;
        }
        System.out.println(count2);
        int count3=0;
        while(match3.find()){
            count3++;
        }
        System.out.println(count3);
        Map<String,Integer> freq=new HashMap<String, Integer>();
        freq.put("one",count1);
        freq.put("two",count2);
        freq.put("three",count3);
        return freq;
    }
}
