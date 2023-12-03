package com.teachmeskills.lesson9.hw9.model.card.impl;

import com.teachmeskills.lesson9.hw9.model.card.BaseCard;

public class VisaCard extends BaseCard {
    private static final int  COMMISSION_VISA_CARD = 3;
    private static final int TRANSFER_LIMIT_VISA_CARD = 5;

    public VisaCard(int cardNumber, int cvv, int countSum) {
        super(cardNumber, cvv, countSum);
    }

    @Override
    public int commission() {
        return COMMISSION_VISA_CARD;
    }

    @Override
    public boolean checkTransferLimits(int amount) {
        if (getCountSum() - amount < TRANSFER_LIMIT_VISA_CARD){
            return false;
        }
        return true;
    }
}
