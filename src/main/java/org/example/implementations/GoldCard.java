package org.example.implementations;

import org.example.base.BaseCard;

public class GoldCard extends BaseCard {



    @Override
    protected double getLimitAmount() {
        return 100000.00;
    }

    public GoldCard(String cardName, String cvv, String expiry, String currency) {
        super(cardName, cvv, expiry, currency);
    }
}
