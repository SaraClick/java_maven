package com.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Factorial_v2Test {

    @Test
    void test5Factorial() {
        Assertions.assertEquals("5!", Factorialv2.reverseFact(120));
    }

    @Test
    void testNoneFactorial() {
        Assertions.assertEquals("NONE", Factorialv2.reverseFact(150));
    }
}