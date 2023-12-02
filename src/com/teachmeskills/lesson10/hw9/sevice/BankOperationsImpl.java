package com.teachmeskills.lesson10.hw9.sevice;

import com.teachmeskills.lesson10.hw9.model.card.BaseCard;

import java.math.BigDecimal;

public class BankOperationsImpl {

    public static void doTransfer(BaseCard cardFrom, int CVV, BaseCard cardTo, int sum) {
        if (cardFrom == null || cardTo == null) {
            return;
        }
        System.out.println("Card From. Before transfer: " + cardFrom.getCardNumber() + "->" + cardFrom.getCountSum());
        System.out.println("Card To. Before transfer: " + cardTo.getCardNumber() + "->" + cardTo.getCountSum());

        int balanceCardFrom = cardFrom.getCountSum();
        int balanceCardTo = cardTo.getCountSum();
        int percent = sum * cardFrom.commission() / 100;
        if (cardFrom.getCvv() != CVV) {
            System.out.println("entered incorrectly CVV");
            return;
        }
        if (checkCardForCommission(cardFrom,cardTo)){
            cardFrom.setCountSum(balanceCardFrom - sum);
            System.out.println("the commission fee is " + "0");
            cardTo.setCountSum(balanceCardTo + sum);
        }
        if (cardFrom.getCountSum() > 0) {
            if (balanceCardFrom - sum - percent > 0) {
                if (cardFrom.checkTransferLimits(sum)) {
                    cardFrom.setCountSum(balanceCardFrom - sum - percent);
                    System.out.println("the commission fee is " + percent);
                    cardTo.setCountSum(balanceCardTo + sum);
                } else System.out.println("insufficient funds");
            } else System.out.println("insufficient funds for transfer");
        } else System.out.println("insufficient funds");

        System.out.println("Card From. After transfer: " + cardFrom.getCardNumber() + "->" + cardFrom.getCountSum());
        System.out.println("Card To. After transfer: " + cardTo.getCardNumber() + "->" + cardTo.getCountSum());
    }

    private static boolean checkCardForCommission(BaseCard cardFrom, BaseCard cardTo) {
        if (cardFrom.getClass().getName().equals(cardTo.getClass().getName())) {
            return true;
        } else {
            return false;
        }
    }
}
