package com.teachmeskills.lesson10.hw10;

import com.teachmeskills.lesson10.hw10.model.card.BaseCard;
import com.teachmeskills.lesson10.hw10.model.card.impl.BelCard;
import com.teachmeskills.lesson10.hw10.model.card.impl.MasterCard;
import com.teachmeskills.lesson10.hw10.model.card.impl.VisaCard;
import com.teachmeskills.lesson10.hw10.model.client.Client;

/**
 * There is a client.
 * The client can have any number of cards.
 * The card has three fields - cvv code, card number and amount on the card.
 * Display a message indicating how many identical cards the client has.
 * The field describing the amount on the card should not be included in the comparison.
 * Those. two multiples with the same cvv codes and numbers, but different amounts are considered the same.
 * Provide different options for the output message - for example,
 * the client does not have any cards, the client does not have identical cards, and other possible situations.
 */
public class Runner {
    public static void main(String[] args) {
        int count = 0;
        BaseCard visa = new VisaCard(123, "1234-1234-2345", 599);
        BaseCard master = new MasterCard(333, "1234-5678-2345", 599);
        BaseCard bel = new BelCard(321, "4321-1234-2345", 599);
        BaseCard visa2 = new VisaCard(123, "1234-1234-2345", 599);
        BaseCard[] baseCards = new BaseCard[]{visa2, visa, master, bel};
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
