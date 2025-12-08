package com.bakery.module1task.syrup;

public class ChocolateSyrup implements Syrup{
    private final String syrupType;

    public ChocolateSyrup() {
        this.syrupType = "chocolate";
    }

    public String getSyrupType() {
        return this.syrupType;
    }
}
