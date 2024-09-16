package com.rohit;

public class RewardValue {
    private double cashValue;
    private double milesValue;
    
    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Conversion from cash to miles
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Conversion from miles to cash
    }

    // Getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}