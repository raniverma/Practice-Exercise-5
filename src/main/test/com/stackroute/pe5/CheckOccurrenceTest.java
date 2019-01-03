package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CheckOccurrenceTest {
    CheckOccurrence obj;
    @Before
    public void setUp() throws Exception {
        obj=new CheckOccurrence();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkOccurrenceOfaWordCorrect(){
        String  array[] ={"a","b","c","d","a","c","c"};
        Map<String,Boolean> mp=new HashMap<String,Boolean>();
        mp.put("a",true);
        mp.put("b",false);
        mp.put("c",true);
        mp.put("d",false);
        assertEquals(mp,obj.checkOccurrenceOfWords(array));
    }

    @Test
    public void checkOccurrenceOfaWordInCorrect(){
        String  array[] ={"a","b","c","d","a","c","c","d","e"};
        Map<String,Boolean> mp=new HashMap<String,Boolean>();
        mp.put("a",true);
        mp.put("b",false);
        mp.put("c",true);
        mp.put("d",true);
        mp.put("e",false);
        assertEquals(mp,obj.checkOccurrenceOfWords(array));
    }

    @Test
    public void NullCase(){
        String array[]={};
        assertNull(obj.checkOccurrenceOfWords(array));
    }

}