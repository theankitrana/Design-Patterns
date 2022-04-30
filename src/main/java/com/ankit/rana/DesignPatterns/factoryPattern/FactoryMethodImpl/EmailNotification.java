package com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethodImpl;

import com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethod.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an E-mail notification");
    }
}
