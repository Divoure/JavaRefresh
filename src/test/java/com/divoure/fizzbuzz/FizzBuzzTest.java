package com.divoure.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void fiveShouldOutputFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertEquals("Fizz", fizzBuzz.getResult());
    }

    @Test
    void minusTenShouldOutputFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        assertEquals("Fizz", fizzBuzz.getResult());
    }

    @Test
    void threeShouldOutputBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals("Buzz", fizzBuzz.getResult());
    }

    @Test
    void minusSixShouldOutputBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(-6);
        assertEquals("Buzz", fizzBuzz.getResult());
    }

    @Test
    void fifteenShouldOutputFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz", fizzBuzz.getResult());
    }

    @Test
    void minusThirtyShouldOutputFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz(-30);
        assertEquals("FizzBuzz", fizzBuzz.getResult());
    }

    @Test
    void oneShouldOutputOne() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertEquals("1", fizzBuzz.getResult());
    }

    @Test
    void minusNinetySevenShouldOutputNinetySeven() {
        FizzBuzz fizzBuzz = new FizzBuzz(-97);
        assertEquals("97", fizzBuzz.getResult());
    }

    // 2147483648 becomes -2147483648 due to int overflow and Math.abs cannot resolve it and returns -2147483648
    @Test
    void integerMaxValuePlusOneEqualsMinValueAndShouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> new FizzBuzz(Integer.MIN_VALUE));
    }
}
