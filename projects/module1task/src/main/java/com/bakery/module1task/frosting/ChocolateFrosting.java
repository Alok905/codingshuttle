package com.bakery.module1task.frosting;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{
    private final String frostingType;

    public ChocolateFrosting() {
        this.frostingType = "chocolate";
    }
    @Override
    public String getFrostingType() {
        return this.frostingType;
    }
}
