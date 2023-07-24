package com.techylads.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void canAddZeroPlusZero(){
        Calculator calc = new Calculator();
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0.");
    }
}
