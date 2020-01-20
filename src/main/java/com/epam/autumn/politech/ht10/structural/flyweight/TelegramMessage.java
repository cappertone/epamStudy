package com.epam.autumn.politech.ht10.structural.flyweight;

public class TelegramMessage implements Message {
    @Override
    public void send() {
        System.out.println("Sending Telegram message");
    }
}
