package com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethodImpl;

import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethod.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an E-mail notification");
    }
}
