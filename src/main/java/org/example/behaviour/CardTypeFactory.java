package org.example.behaviour;

import org.example.base.BaseCard;
import org.example.implementations.BronzeCard;
import org.example.implementations.GoldCard;
import org.example.implementations.SilverCard;

public class CardTypeFactory {
    public static BaseCard createCard(String cardType) {
        String cardName = "This doesnt matter";
        String cvv = "This doesnt matter";
        String expiry = "This doesnt matter";
        String currency = "USD";

        return switch (cardType) {
            case "Silver" -> new SilverCard(cardName, cvv, expiry, currency);
            case "Gold" -> new GoldCard(cardName, cvv, expiry, currency);
            case "Bronze" -> new BronzeCard(cardName, cvv, expiry, currency);
            default -> new BaseCard(cardName, cvv, expiry, currency) {

                @Override
                protected double getLimitAmount() {
                    return 1000.00;
                }
            };
        };
    }
}
