package at.technikum.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator =  new Calculator();
    }

    @Test
    void sum() {
        assertEquals(5, calculator.sum(3,2));
    }

    @Test
    void multiply(){
        assertEquals(6, calculator.multiply(3,2));
    }
}