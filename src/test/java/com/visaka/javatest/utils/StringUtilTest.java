package com.visaka.javatest.utils;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals("Holaooo", StringUtil.repeat( "Holaooo", 1 ));
    }


//    public static void main(String[] args) {
//
//        assertEquals(StringUltil.repeat( "Hola", 3 ), "HolaHolaHola");
//
//
////        assertEquals(StringUltil.repeat( "Hola", 1 ), "Hola");
////        if (result2.equals("HolaHol")){
//////            System.out.println("ERROR");
////            throw new RuntimeException("ERROR");
////        }
//        Assert.assertEquals("Holaooo", StringUltil.repeat( "Holaooo", 1 ));
//    }

//    private static void assertEquals(String actual, String expected) {
//        if (!actual.equals(expected)){
//            throw new RuntimeException(actual + " is not equal to expected " + expected);
//        }
//    }
}