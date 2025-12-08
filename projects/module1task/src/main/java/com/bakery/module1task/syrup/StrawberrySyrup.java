package com.bakery.module1task.syrup;



public class StrawberrySyrup implements Syrup{
    private final String syrupType;

    public StrawberrySyrup() {
        this.syrupType = "strawberry";
    }
    public String getSyrupType() {
        return this.syrupType;
    }
}
