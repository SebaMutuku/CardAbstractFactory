package org.example.implementations;

import org.example.base.BaseCard;

public class SilverCard extends BaseCard {
    @Override
    protected double getLimitAmount() {
        return 50000.00;
    }

    public SilverCard(String cardName, String cvv, String expiry, String currency) {
        super(cardName, cvv, expiry, currency);

    }

}
