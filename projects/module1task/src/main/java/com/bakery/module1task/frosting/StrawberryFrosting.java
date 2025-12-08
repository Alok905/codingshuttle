package com.bakery.module1task.frosting;


public class StrawberryFrosting implements Frosting{
    private final String frostingType;

    public StrawberryFrosting() {
        this.frostingType = "strawberry";
    }

    public String getFrostingType() {
        return this.frostingType;
    }
}