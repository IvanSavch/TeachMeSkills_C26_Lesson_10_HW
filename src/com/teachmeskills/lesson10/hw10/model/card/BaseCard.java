package com.teachmeskills.lesson10.hw10.model.card;

import java.util.Objects;

public class BaseCard {
    private int CVV;
    private String numberCard;
    private int sum;

    public BaseCard(int CVV, String numberCard, int sum) {
        this.CVV = CVV;
        this.numberCard = numberCard;
        this.sum = sum;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return CVV == baseCard.CVV && Objects.equals(numberCard, baseCard.numberCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CVV, numberCard);
    }
}
