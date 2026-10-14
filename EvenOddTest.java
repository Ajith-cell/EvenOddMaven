package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(8));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    void testZeroIsEven() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(-4));
    }
}
