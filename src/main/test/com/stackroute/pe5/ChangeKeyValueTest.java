package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ChangeKeyValueTest {
     ChangeKeyValue obj;
    @Before
    public void setUp() throws Exception {
        obj=new ChangeKeyValue();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void changekeyValueCorrect() {
        Map<String,String> inputMap=new HashMap<String, String>();
        inputMap.put("val1","mars");
        inputMap.put("val2","saturn");
        Map<String,String> resMap=new HashMap<String, String>();
        resMap.put("val1"," ");
        resMap.put("val2","mars");
        assertEquals(resMap,obj.changeKeyValueInMap(inputMap));
    }
    @Test
    public void changekeyValueInCorrect() {
        Map<String,String> inputMap=new HashMap<String, String>();
        inputMap.put("val1","java");
        inputMap.put("val2","c++");
        Map<String,String> resMap=new HashMap<String, String>();
        resMap.put("val1"," ");
        resMap.put("val2","java");
        assertEquals(resMap,obj.changeKeyValueInMap(inputMap));
    }
    @Test
    public void IsnNull(){
        Map<String,String> map=new HashMap<String, String>();
        assertNull(obj.changeKeyValueInMap(map));
    }
    @Test
    public void OnlyElement(){
        Map<String,String> inputMap=new HashMap<String, String>();
        inputMap.put("val1","java");
        Map<String,String> resMap=new HashMap<String, String>();
        resMap.put("val1","java");
        assertEquals(resMap,obj.changeKeyValueInMap(inputMap));
    }

}