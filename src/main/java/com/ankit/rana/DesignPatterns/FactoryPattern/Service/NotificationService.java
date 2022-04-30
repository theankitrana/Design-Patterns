package com.ankit.rana.DesignPatterns.FactoryPattern.Service;


import com.ankit.rana.DesignPatterns.FactoryPattern.FactoryMethod.Notification;
import com.ankit.rana.DesignPatterns.FactoryPattern.ObjectFactory.NotificationFactory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = new NotificationFactory().createNotification("PUSH");
        notification.notifyUser();
    }
}
