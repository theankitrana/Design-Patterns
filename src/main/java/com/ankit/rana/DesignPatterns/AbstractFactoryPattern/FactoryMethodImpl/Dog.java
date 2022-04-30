package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Animal;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
