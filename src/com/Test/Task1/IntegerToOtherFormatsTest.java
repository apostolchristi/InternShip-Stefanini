package com.Test.Task1;

import com.company.Task_1.IntegerToOtherFormats;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IntegerToOtherFormatsTest {

    private IntegerToOtherFormats integerToOtherFormatsInstance ;
    private int inputInteger;
    private String expectedResult;
    private static int before;

    public IntegerToOtherFormatsTest(int inputInteger, String expectedResult) {
        this.inputInteger = inputInteger;
        this.expectedResult = expectedResult;
    }

    @org.junit.BeforeClass
    public static void beforeClassOnce() {
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "10"},
                {3, "11"},
                {-0, "0"},
                {-1, "-1"},
                {-2, "-10"},
                {-3, "-11"},
                {Integer.MAX_VALUE, "1111111111111111111111111111111"},
                {Integer.MIN_VALUE, "-10000000000000000000000000000000"},
                {Long.MAX_VALUE, "-10000000000000000000000000000000"},
        });
    }



    @org.junit.Before
    public void setUpBefore() throws Exception {
        integerToOtherFormatsInstance = new IntegerToOtherFormats();
    }


    @org.junit.Test // (expected = IllegalArgumentException.class)
    public void convertToBinary() {
        String var = integerToOtherFormatsInstance.convertToBinary(inputInteger);
        assertEquals(expectedResult, var);
    }

    @org.junit.After
    public void setUpAfter() throws Exception {
    }

    @org.junit.AfterClass
    public static void afterClassOnce() {


    }
}