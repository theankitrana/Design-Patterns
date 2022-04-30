package com.ankit.rana.DesignPatterns.Builder.Service;

import com.ankit.rana.DesignPatterns.Builder.BuilderImpl.IglooHouseBuilder;
import com.ankit.rana.DesignPatterns.Builder.BuilderInterface.House;
import com.ankit.rana.DesignPatterns.Builder.BuilderInterface.HouseBuilder;
import com.ankit.rana.DesignPatterns.Builder.Director.CivilEngineer;

public class Builder {
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder Constructed : "+house + "   " + house.getBasement());

    }
}
