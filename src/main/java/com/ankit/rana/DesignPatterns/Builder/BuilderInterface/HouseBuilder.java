package com.ankit.rana.DesignPatterns.Builder.BuilderInterface;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}
