package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethodImpl;

import com.ankit.rana.DesignPatterns.AbstractFactoryPattern.FactoryMethod.Color;

public class Black implements Color {
    @Override
    public String getColor() {
        return "Black";
    }
}
