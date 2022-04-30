package com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethodImpl;

import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethod.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
