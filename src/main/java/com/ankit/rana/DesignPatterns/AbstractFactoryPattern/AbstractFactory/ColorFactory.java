package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Color;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl.Black;
import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl.Blue;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color create(String color) {
        if ("blue".equalsIgnoreCase(color))
        {
            return new Blue();
        }
        else if("black".equalsIgnoreCase(color))
        {
            return new Black();
        }
        return null;
    }
}
