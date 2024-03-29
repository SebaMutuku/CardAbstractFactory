package org.example.implementations;

import org.example.base.BaseCard;


/**
 * This class is to create a Base card class with characteristics called Gold
 */
public class GoldCard extends BaseCard {



    @Override
    protected double getLimitAmount() {
        return 100000.00;
    }

    public GoldCard(String cardName, String cvv, String expiry, String currency) {
        super(cardName, cvv, expiry, currency);
    }
}
