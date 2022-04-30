package com.ankit.rana.DesignPatterns.factoryPattern.ObjectFactory;

import com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethod.Notification;
import com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethodImpl.EmailNotification;
import com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethodImpl.PushNotification;
import com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethodImpl.SMSNotification;

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
