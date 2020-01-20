package com.epam.autumn.politech.ht10.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MaillingFactory {
    private static final Map<String, Message> messageMap = new HashMap();
    public Message getMessage(String target){
        Message message = messageMap.get(target);
        if(message == null){
            switch (target){
                case "Email":
                    message = new EmailMessage();
                    break;
                case "Telegram":
                    message = new TelegramMessage();
                    break;
            }
            messageMap.put(target, message);
        }
        return message;
    }
}
