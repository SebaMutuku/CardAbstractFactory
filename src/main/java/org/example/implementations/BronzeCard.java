package org.example.implementations;

import org.example.base.BaseCard;


/**
 * This class is to create a Base card class with characteristics called Bronze
 */
public class BronzeCard extends BaseCard {

    @Override
    protected double getLimitAmount() {
        return 5000.00;
    }

    public BronzeCard(String cardName, String cvv, String expiry, String currency) {
        super(cardName, cvv, expiry, currency);
    }

}
