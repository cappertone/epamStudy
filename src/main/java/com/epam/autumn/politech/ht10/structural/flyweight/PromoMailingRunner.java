package com.epam.autumn.politech.ht10.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PromoMailingRunner {
    public static void main(String[] args) {
        MaillingFactory factory = new MaillingFactory();
        List<Message> messageList = new ArrayList<>();

        messageList.add(factory.getMessage("Telegram"));
        messageList.add(factory.getMessage("Telegram"));
        messageList.add(factory.getMessage("Telegram"));
        messageList.add(factory.getMessage("Telegram"));

        messageList.add(factory.getMessage("Email"));
        messageList.add(factory.getMessage("Email"));
        messageList.add(factory.getMessage("Email"));
        messageList.add(factory.getMessage("Email"));
        messageList.add(factory.getMessage("Email"));

        for (Message message : messageList) {
            message.send();
        }

    }
}
