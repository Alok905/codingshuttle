package com.bakery.module1task.frosting;

import org.springframework.stereotype.Component;

//@Component
public class StrawberryFrosting implements Frosting{
    private final String frostingType;

    public StrawberryFrosting() {
        this.frostingType = "strawberry";
    }
    @Override
    public String getFrostingType() {
        return this.frostingType;
    }
}