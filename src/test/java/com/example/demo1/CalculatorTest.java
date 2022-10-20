package com.example.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void test1(){
        assertEquals(9, calculator.add(5, 4));
    }

    @Test
    public void test2(){
        assertEquals(12, calculator.add(2, 10));
    }


}
