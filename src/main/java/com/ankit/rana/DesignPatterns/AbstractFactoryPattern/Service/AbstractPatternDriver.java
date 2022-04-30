package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.Service;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Animal;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Color;

public class AbstractPatternDriver {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) abstractFactory.create("Dog");

        System.out.println("Animal Name : " +animal.getAnimal() + "   Sound : "+animal.makeSound());

        abstractFactory= FactoryProvider.getFactory("color");
        Color color = (Color) abstractFactory.create("Blue");
        System.out.println("Color Name : " +color.getColor());


    }
}
