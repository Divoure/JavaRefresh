// A program where the user enters a number.
// This is in reverse to the normal FizzBuzz where 5 would Buzz and 3 would Fizz as it makes more sense to me.
// If number divisible by 5: output Fizz (5)
// If number divisible by 3: output Buzz (3)
// If number is divisible by both 5 and 3: output FizzBuzz (15)
// And if number is not divisible by both 5 and 3: output same number (7)
package com.divoure.fizzbuzz;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int input) {
        this.number = Math.abs(input);
    }

    String getResult() {
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
