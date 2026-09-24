// Make a simple interest calculator
// Interest = Principal × Annual Interest Rate * (Term / Frequency)
// P=Principal (€), R=Annual Interest Rate (%), T=Term (months), F=Frequency (12 months per year, constant)
// Input <- P = 10000, R = 5, T = 60
// Output -> 2500

package com.divoure.interestcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculator {
    private static final short frequency = 12;
    private final double principal;
    private final float interestRate;
    private final short term;
    private final double interest;

    public InterestCalculator(double principal, float interestRate, short term) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.term = term;
        this.interest = BigDecimal.valueOf(
                        this.principal * (this.interestRate / 100.0) * ((float) this.term / frequency))
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    public void logInterest() {
        System.out.println("Interest: " + this.interest);
    }

    public double getPrincipal() {
        return principal;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public short getTerm() {
        return term;
    }

    public double getInterest() {
        return this.interest;
    }
}
