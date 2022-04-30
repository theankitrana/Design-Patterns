package com.ankit.rana.DesignPatterns.AbstractFactoryPattern.AbstractFactory;

public interface AbstractFactory<T>{
    T create(String objectType);
}
