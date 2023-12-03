package com.teachmeskills.lesson10.hw10;

import com.teachmeskills.lesson10.hw10.model.card.BaseCard;
import com.teachmeskills.lesson10.hw10.model.card.impl.BelCard;
import com.teachmeskills.lesson10.hw10.model.card.impl.MasterCard;
import com.teachmeskills.lesson10.hw10.model.card.impl.VisaCard;
import com.teachmeskills.lesson10.hw10.model.client.Client;

public class Runner {
    public static void main(String[] args) {
        int count = 0;
        BaseCard visa = new VisaCard(123, "1234-1234-2345", 599);
        BaseCard master = new MasterCard(333, "1234-5678-2345", 599);
        BaseCard bel = new BelCard(321, "4321-1234-2345", 599);
        BaseCard visa2 = new VisaCard(123, "1234-1234-2345", 599);
        BaseCard[] baseCards = new BaseCard[]{ visa, master, bel};
        Client client = new Client("Ivan", baseCards);

        if (client.getBaseCards().length != 0) {
            for (int i = 0; i < client.getBaseCards().length - i - 1; i++) {
                if (client.getBaseCards()[i].equals(client.getBaseCards()[i + 1])) {
                    count++;
                }
            }
        }else {
            System.out.println("the client does have cards");
        }

        if (count == 0) {
            System.out.println("the client does not have the same cards");
        }
        System.out.println("the client have the same card: " + count);
    }
}
