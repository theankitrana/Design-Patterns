package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Animal;

public class Duck implements Animal {
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
