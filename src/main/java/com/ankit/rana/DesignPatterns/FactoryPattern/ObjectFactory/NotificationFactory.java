package com.ankit.rana.DesignPatterns.FactoryPattern.ObjectFactory;

import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethod.Notification;
import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethodImpl.EmailNotification;
import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethodImpl.PushNotification;
import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethodImpl.SMSNotification;

public class NotificationFactory {

    public Notification createNotification(String channel)
    {
        if(channel==null || channel.isEmpty())
            return null;
            switch (channel){
                case "SMS" :
                    return new SMSNotification();
                case "EMAIL":
                    return new EmailNotification();
                case "PUSH":
                    return new PushNotification();
                default:
                    throw new IllegalArgumentException("Unknown Channel : " + channel);
            }
        }
    }
