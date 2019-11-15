package org.abc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();

        assertEquals(50,calc.add(20,30));
    }
}
