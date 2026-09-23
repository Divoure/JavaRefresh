package com.divoure.interestcalculator;

import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner input = new Scanner(System.in);

    public static String getUserInput(String inputLabel, String minimum) {
        String inputText;
        System.out.printf("Enter %s (minimum %s): %n", inputLabel, minimum);
        inputText = input.next().trim();
        if (inputText.isBlank()) {
            System.out.println(inputLabel + " cannot be blank! Try again.");
        } else {
            inputText = inputText.replace(
                    ",", "").replace("€", "").replace("%", "");
            inputText = inputText.trim();
        }
        return inputText;
    }

    public double getPrincipal() {
        String principalAmountText;
        double principalAmount;

        while (true) {
            // Principal
            // The user enters a number between 100 - 10,000,000
            principalAmountText = getUserInput("principal loan amount", "100€");
            if (principalAmountText.isEmpty()) {
                continue;
            }
            try {
                principalAmount = Double.parseDouble(principalAmountText);
            } catch (NumberFormatException e) {
                System.out.println("Value entered must be a valid number! Try again.");
                continue;
            }
            if (100.0 <= principalAmount && principalAmount <= 10000000.0) {
                break;
            } else {
                System.out.println("Principal loan amount must be any value between 100€ - 10,000,000€! Try again");
            }
        }
        return principalAmount;
    }

    public float getInterestRate() {
        String interestRateText;
        float interestRate;

        while (true) {
            // Interest rate
            // The user enters a value between 0% - 50%.
            interestRateText = getUserInput("interest rate", "0%");
            if (interestRateText.isEmpty()) {
                continue;
            }
            try {
                interestRate = Float.parseFloat(interestRateText);
            } catch (NumberFormatException e) {
                System.out.println("Interest rate must be a valid percentage! Try again.");
                continue;
            }
            if (0.0 <= interestRate && interestRate <= 50.0) {
                break;
            } else {
                System.out.println("Interest rate must be between 0% - 50%");
            }
        }
        return interestRate;
    }

    public short getTerm() {
        String termLengthText;
        short termLength;

        while (true) {
            // Term length / Loan length
            // The user enters the number of months that is between (including) 3 months - 240 months (20 years).
            termLengthText = getUserInput("term length", "3 months");
            termLengthText = termLengthText.replaceAll("[^0-9.,]", "").trim();
            if (termLengthText.isBlank()) {
                System.out.println("Loan term cannot be blank! Try again.");
                continue;
            }
            try {
                termLength = Short.parseShort(termLengthText);
            } catch (NumberFormatException e) {
                System.out.println("Loan term must be a valid number of months! Try again.");
                continue;
            }
            if (3 <= termLength && termLength <= 240) {
                break;
            } else {
                System.out.println("Loan term must be between 3 months - 240 months.");
            }
        }
        return termLength;
    }
}
