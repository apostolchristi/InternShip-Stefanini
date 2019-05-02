package com.Test.Task2;

import com.company.Task_2.IntegerNormalizes;
import org.junit.Before;
import org.junit.Test;

/*
* Similar as Task1
 */
import static org.junit.Assert.*;

public class IntegerNormalizesTest {
    private IntegerNormalizes taskNr2instance;

    @Before
    public void setUp() throws Exception {
        taskNr2instance = new IntegerNormalizes();

    }

    @Test
    public void normalizingAngleMath_floorMood() {
        int test = taskNr2instance.normalizingAngleMath_floorMood(25);
        assertEquals(25,test);
    }

    @Test
    public void normalizingAngleModulus() {
        int test = taskNr2instance.normalizingAngleMath_floorMood(25);
        assertEquals(25,test);
    }
}