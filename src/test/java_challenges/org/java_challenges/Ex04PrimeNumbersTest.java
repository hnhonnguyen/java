package org.java_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex04PrimeNumbersTest {
    Ex04PrimeNumbers ex04PrimeNumbers = new Ex04PrimeNumbers();
    @Test
    void notPrimeNumber(){
        assertFalse(ex04PrimeNumbers.isPrimeNumbers(10));
    }
    @Test
    void primeNumber(){
        assertTrue(ex04PrimeNumbers.isPrimeNumbers(7));
    }
}
