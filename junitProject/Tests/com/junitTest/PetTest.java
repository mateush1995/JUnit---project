package com.junitTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    Pet billie;

    @Before
    public void PetTest(){
        billie = new Pet("Billie", 4);
    }

    @Test
    public void testPersonalData() throws Exception{
        assertEquals("Billie", billie.getName());
        assertEquals(4, billie.getAge());
    }

    @Test
    public void testIfNotNull() throws Exception{
        assertNotNull(billie);
    }

    @Test
    public void testNotSame() throws Exception{
        Pet bobby = billie;
        assertSame(bobby, billie);
    }


}