package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortASetTest {
    SortASet obj;

    @Before
    public void setUp() throws Exception {
        obj=new SortASet();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortedSet() {
        Set<String> inputSet=new HashSet<String>();
        inputSet.add("Harry");
        inputSet.add("Olive");
        inputSet.add("Alice");
        inputSet.add("Bluto");
        inputSet.add("Eugene");
        Set<String> resSet=new HashSet<String>();
        resSet.add("Alice");
        resSet.add("Bluto");
        resSet.add("Eugene");
        resSet.add("Harry");
        resSet.add("Olive");
        assertEquals(resSet,obj.sortedSet(inputSet));
    }
}