package com.aim.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorApplicationTest {
     private CalculatorApplication calculator = new CalculatorApplication();

     @Test
     public void testSum() {
         assertEquals(5, calculator.sum(2, 3));
     }
}
