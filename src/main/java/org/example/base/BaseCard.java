package org.example.base;


import java.util.Random;


/**
 * This class is to create a Base card class with base characteristics
 */
public abstract class BaseCard {

    private final String cardName;
    private final int cardNumber;
    private final String cvv;
    private final String expiryDate;
    private final String currency;
    private final double amount;


    protected abstract double getLimitAmount();


    public BaseCard(String cardName, String cvv, String expiry, String currency) {
        this.cardName = cardName;
        this.cardNumber = generatedCardNumber();
        this.cvv = cvv;
        this.expiryDate = expiry;
        this.amount = getLimitAmount();
        this.currency = currency;

    }

    @Override
    public String toString() {
        return "BaseCard{" +
                "cardName='" + cardName + '\'' +
                ", cardNumber=" + cardNumber +
                ", cvv='" + cvv + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    private int generatedCardNumber() {
        return Math.abs(new Random(12).nextInt() % 1000000000);
    }
}
