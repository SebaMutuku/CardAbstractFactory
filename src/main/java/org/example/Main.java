package org.example;

import org.example.base.BaseCard;
import org.example.behaviour.CardTypeFactory;

public class Main {

    public static void main(String[] args) {
        //Create bronze card
        BaseCard bronzeCard = CardTypeFactory.createCard("Bronze");
        System.out.println(bronzeCard);

        // //Create Silver card
        BaseCard silverCard = CardTypeFactory.createCard("Silver");
        System.out.println(silverCard);

        //Create Silver card
        BaseCard goldenCard = CardTypeFactory.createCard("Gold");
        System.out.println(goldenCard);
    }
}