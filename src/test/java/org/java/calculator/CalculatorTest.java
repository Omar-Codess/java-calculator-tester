package org.java.calculator;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(0, calculator.subtract(1, 1));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(1, calculator.divide(1, 1));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(1, calculator.multiply(1, 1));
    }
}