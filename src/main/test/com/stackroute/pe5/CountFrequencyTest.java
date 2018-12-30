package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountFrequencyTest {
    CountFrequency obj;
    @Before
    public void setUp() throws Exception {
        obj=new CountFrequency();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void countFreqOfWordsCorrect() {
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> freq=new HashMap<String, Integer>();
        freq.put("one",5);
        freq.put("two",2);
        freq.put("three",2);
        assertEquals(freq,obj.CountFreqOfWords(str));
    }
}