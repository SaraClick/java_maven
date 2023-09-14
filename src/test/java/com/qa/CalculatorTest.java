package com.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd1_1() {
        Assertions.assertEquals(2, Calculator.add(1,1));
    }

    @Test
    void testAdd5_3() {
        Assertions.assertEquals(8, Calculator.add(5,3));
    }

    @Test
    void testAddDoubles() {
        Assertions.assertEquals(58.75, Calculator.add(50.25,8.5));
    }

    @Test
    void testSubtract20_8() {
        Assertions.assertEquals(12, Calculator.subtract(20,8));
    }

    @Test
    void testSubtract5_30() {
        Assertions.assertEquals(-25, Calculator.subtract(5,30));
    }

    @Test
    void testSubtractDoubles() {
        Assertions.assertEquals(40.50, Calculator.subtract(80,39.5));
    }

    @Test
    void testMultiply20_4() {
        Assertions.assertEquals(80, Calculator.multiply(20,4));
    }

    @Test
    void testMultiply3_100() {
        Assertions.assertEquals(-300, Calculator.multiply(-3,100));
    }

    @Test
    void testMultiplyDoubles() {
        Assertions.assertEquals(40.50, Calculator.multiply(20.25,2));
    }

    @Test
    void testDivide20_4() {
        Assertions.assertEquals(5, Calculator.divide(20,4));
    }

    @Test
    void testDivide3_100() {
        Assertions.assertEquals(-0.03, Calculator.divide(-3,100));
    }

    @Test
    void testDivideDoubles() {
        Assertions.assertEquals(10.125, Calculator.divide(20.25,2));
    }


}
