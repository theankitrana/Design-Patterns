package com.ankit.rana.DesignPatterns.factoryPattern.Service;


import com.ankit.rana.DesignPatterns.factoryPattern.FactoryMethod.Notification;
import com.ankit.rana.DesignPatterns.factoryPattern.ObjectFactory.NotificationFactory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = new NotificationFactory().createNotification("PUSH");
        notification.notifyUser();
    }
}
