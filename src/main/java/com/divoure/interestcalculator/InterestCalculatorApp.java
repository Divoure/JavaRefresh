package com.divoure.interestcalculator;

class InterestCalculatorApp {
    public static void main(String[] args) {
        UserInputHandler userInputHandler = new UserInputHandler();

        InterestCalculator interestCalculator = new InterestCalculator(
                userInputHandler.getPrincipal(), userInputHandler.getInterestRate(), userInputHandler.getTerm());
        interestCalculator.logInterest();
    }
}
