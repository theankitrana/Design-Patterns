package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Animal;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl.Dog;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl.Duck;

public class AnimalFactory implements AbstractFactory{
    @Override
    public Animal create(String animalType) {
        if("Dog".equalsIgnoreCase(animalType))
        {
            return new Dog();
        }
        else
            if("Duck".equalsIgnoreCase(animalType))
            {
                return new Duck();
            }
            return null;
    }
}
