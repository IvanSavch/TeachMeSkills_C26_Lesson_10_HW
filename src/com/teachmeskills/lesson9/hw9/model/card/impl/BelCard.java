package com.teachmeskills.lesson9.hw9.model.card.impl;

import com.teachmeskills.lesson9.hw9.model.card.BaseCard;

public class BelCard extends BaseCard {
    private static final int  COMMISSION_BEL_CARD = 5;
    public static final int TRANSFER_LIMIT_BEL_CARD = 7;
    public BelCard(int cardNumber, int cvv, int countSum) {
        super(cardNumber, cvv, countSum);
    }

    @Override
    public int commission() {
        return COMMISSION_BEL_CARD;
    }

    @Override
    public boolean checkTransferLimits(int amount) {
        if (getCountSum() - amount < TRANSFER_LIMIT_BEL_CARD){
            return false;
        }
        return true;
    }
}
