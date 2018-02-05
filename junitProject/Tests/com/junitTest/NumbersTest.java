package com.junitTest;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NumbersTest {

    Numbers numbers1, numbers2;
    List<Numbers> numbersList = new ArrayList<Numbers>();

    @Before
    public void NumbersTest(){
        numbers1 = new Numbers(3, 4);
        numbers2 = new Numbers(9, 7);
        numbersList.add(numbers1);
        numbersList.add(numbers2);
        numbersList.add(null);
    }


    @Test
    public void testIsFalse(){
        assertFalse(numbers1.isGreater());
    }

    @Test
    public void testisTrue(){
        assertTrue(numbers2.isGreater());
    }

    @Test
    public void testIfNull(){
        assertNull(numbersList.get(2));
    }

}