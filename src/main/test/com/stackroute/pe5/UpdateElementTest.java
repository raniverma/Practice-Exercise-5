package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateElementTest {
    UpdateElement obj;
    @Before
    public void setUp() throws Exception {
        obj=new UpdateElement();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void updateCorrect(){
        List<String> list= new ArrayList<String>(Arrays.asList(new String[]{"grapes", "mango", "orange","banana"}));
        List<String> expected= new ArrayList<String>(Arrays.asList(new String[]{"apple", "mango", "orange","banana"}));
        assertEquals(expected,obj.UpdateElements(list,"apple",0));
    }
    @Test
    public void updateNull(){
        List<String > list=new ArrayList<String>();
        assertNull(obj.UpdateElements(list,"pratima",1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        List<String> list = new ArrayList<String >();
        list.add("grapes");
        list=obj.UpdateElements(list,"apple",1);
    }
}
