package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
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
        Set<String> inputSet= new HashSet<String>(Arrays.asList(new String[]{"Harry", "Olive", "Alice","Bluto","Eugene"}));
        Set<String> resSet= new HashSet<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}));
        assertEquals(resSet,obj.sortedSet(inputSet));
    }

    @Test
    public void nullSetCase(){
        Set<String> inputSet=new HashSet<String>();
        assertNull(obj.sortedSet(inputSet));
    }
}