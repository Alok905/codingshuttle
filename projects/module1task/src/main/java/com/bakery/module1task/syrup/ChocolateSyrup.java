package com.bakery.module1task.syrup;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup{
    private final String syrupType;

    public ChocolateSyrup() {
        this.syrupType = "chocolate";
    }
    @Override
    public String getSyrupType() {
        return this.syrupType;
    }
}
