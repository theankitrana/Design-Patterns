package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.Service;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory.AnimalFactory;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory.ColorFactory;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Animal;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl.Dog;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice)
    {
        if("Animal".equalsIgnoreCase(choice))
        {
            return new AnimalFactory();
        }
        else
            if("color".equalsIgnoreCase(choice)){
                return new ColorFactory();
            }
            return null;
    }

}
