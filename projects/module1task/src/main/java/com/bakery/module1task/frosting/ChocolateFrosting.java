package com.bakery.module1task.frosting;


public class ChocolateFrosting implements Frosting{
    private final String frostingType;

    public ChocolateFrosting() {
        this.frostingType = "chocolate";
    }

    public String getFrostingType() {
        return this.frostingType;
    }
}
