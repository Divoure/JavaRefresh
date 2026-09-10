package com.divoure.fizzbuzz;


import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int input = scanner.nextInt();
            if (input == Integer.MIN_VALUE) {
                throw new ArithmeticException();
            }
            FizzBuzz fizzBuzz = new FizzBuzz(input);
            System.out.println(fizzBuzz.getResult());
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
