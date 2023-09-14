package com.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {


    @Test
    void test7_NONE() {
        Assertions.assertEquals("Factorial of 7: NONE",Factorial.findFact(7));
    }

    @Test
    void test100_NONE() {
        Assertions.assertEquals("Factorial of 100: NONE",Factorial.findFact(100));
    }

    @Test
    void test0_fact1() {
        Assertions.assertEquals("Factorial of 0: 1!",Factorial.findFact(0));
    }

    @Test
    void test24_fact4() {
        Assertions.assertEquals("Factorial of 24: 4!",Factorial.findFact(24));
    }

    @Test
    void test120_fact5() {
        Assertions.assertEquals("Factorial of 120: 5!",Factorial.findFact(120));
    }


}
