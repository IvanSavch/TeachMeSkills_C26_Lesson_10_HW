package com.teachmeskills.lesson9.hw9;

import com.teachmeskills.lesson9.hw9.model.address.Address;
import com.teachmeskills.lesson9.hw9.model.card.BaseCard;
import com.teachmeskills.lesson9.hw9.model.card.impl.BelCard;
import com.teachmeskills.lesson9.hw9.model.card.impl.MasterCard;
import com.teachmeskills.lesson9.hw9.model.card.impl.VisaCard;
import com.teachmeskills.lesson9.hw9.model.client.Client;
import com.teachmeskills.lesson9.hw9.sevice.BankOperationsImpl;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        BaseCard visaCard = new VisaCard(1, 123, 333);
        BaseCard masterCard =  new MasterCard( 3212, 123, 560);
        BaseCard belCard = new BelCard( 12333, 456, 123);
        BaseCard[] cards = new BaseCard[]{visaCard,masterCard,belCard};
        Address address = new Address(12331, "Belarus", "Minsk", "Part", 43);
        Client ivan = new Client("Ivan", "Savchenko", "TR34508", "13.04.2003", address, cards);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter card from transfer");
        BaseCard card1 = ivan.getCard(scanner.nextInt());
        System.out.println("enter card from transfer");
        BaseCard card2 = ivan.getCard(scanner.nextInt());
        System.out.println("enter CVV");
        int CVV = scanner.nextInt();
        System.out.println("enter sum");
        int sum = scanner.nextInt();
        BankOperationsImpl.doTransfer(card1,CVV,card2,sum);
        System.out.println(ivan);

    }

}
