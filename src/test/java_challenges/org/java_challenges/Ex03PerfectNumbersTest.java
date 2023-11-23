package org.java_challenges;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex03PerfectNumbersTest {
    @Test
    void notPerfectNumberSimple(){
        assertFalse(Ex03PerfectNumbers.isPerfectNumberSimple(10));
    }
    @Test
    void PerfectNumberSimple(){
        assertTrue(Ex03PerfectNumbers.isPerfectNumberSimple(6));
    }
}
