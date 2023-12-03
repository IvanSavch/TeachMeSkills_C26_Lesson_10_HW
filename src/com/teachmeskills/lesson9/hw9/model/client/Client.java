package com.teachmeskills.lesson9.hw9.model.client;

import com.teachmeskills.lesson9.hw9.model.address.Address;
import com.teachmeskills.lesson9.hw9.model.card.BaseCard;

public class Client {
    private String name;
    private String surName;
    private String passportNumber;
    private String dateBirthday;
    private Address address;
    private BaseCard[] cards;

    public Client(String name, String surName, String passportNumber, String dateBirthday, Address address, BaseCard[] cards) {
        this.name = name;
        this.surName = surName;
        this.passportNumber = passportNumber;
        this.dateBirthday = dateBirthday;
        this.address = address;
        this.cards = cards;
    }
    public BaseCard getCard(int id) {
        int count = -1;
        for(BaseCard baseCard: cards){
            count++;
            if (baseCard.getId() == id) {
                break;
            }
        }
        return cards[count];
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\n' +
                " surName='" + surName + '\n' +
                " passportNumber='" + passportNumber + '\n' +
                " dateBirthday=" + dateBirthday + '\n' +
                address + '\n' +
                '}';
    }
}
