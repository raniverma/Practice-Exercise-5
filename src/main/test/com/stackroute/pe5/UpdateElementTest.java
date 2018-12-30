package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
        List<String > input=new ArrayList<String>();
        input.add("grapes");
        input.add("mango");
        input.add("orange");
        input.add("banana");
        List<String> expected=new ArrayList<String>();
        input.add("apple");
        input.add("mango");
        input.add("orange");
        input.add("banana");
        assertEquals(expected,obj.UpdateElements(input,"apple",0));
    }
}
