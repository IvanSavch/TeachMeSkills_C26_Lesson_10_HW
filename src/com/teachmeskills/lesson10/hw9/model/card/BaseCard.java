package com.teachmeskills.lesson10.hw9.model.card;

import java.math.BigDecimal;

public abstract class BaseCard {
    private static long count = 0;
    private long id;
    private int cardNumber;
    private int cvv;
    private int countSum;

    public BaseCard( int cardNumber, int cvv, int countSum) {
        this.id = ++count;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.countSum = countSum;
    }
    public abstract int commission ();
    public abstract boolean checkTransferLimits(int amount);

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        BaseCard.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCountSum() {
        return countSum;
    }

    public void setCountSum(int countSum) {
        this.countSum = countSum;
    }
}
