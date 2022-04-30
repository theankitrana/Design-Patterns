package com.ankit.rana.DesignPatterns.Builder.BuilderImpl;

import com.ankit.rana.DesignPatterns.Builder.BuilderInterface.House;
import com.ankit.rana.DesignPatterns.Builder.BuilderInterface.HouseBuilder;

public class TipiHouseBuilder implements HouseBuilder {

    private House house;

    public TipiHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood and Skin");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Fire Wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
