package com.teachmeskills.lesson10.hw9.model.card.impl;

import com.teachmeskills.lesson10.hw9.model.card.BaseCard;

import java.math.BigDecimal;

public class MasterCard extends BaseCard {
    private static final int  COMMISSION_MASTER_CARD = 2;
    public static final int TRANSFER_LIMIT_BEL_CARD = 7;

    public MasterCard(int cardNumber, int cvv, int countSum) {
        super(cardNumber, cvv, countSum);
    }

    @Override
    public int commission() {
        return COMMISSION_MASTER_CARD;
    }

    @Override
    public boolean checkTransferLimits(int amount) {
        if (getCountSum() - amount < TRANSFER_LIMIT_BEL_CARD){
            return false;
        }
        return true;
    }
}
