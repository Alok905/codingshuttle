package com.bakery.module1task.syrup;

import org.springframework.stereotype.Component;

//@Component
public class StrawberrySyrup implements Syrup{
    private final String syrupType;

    public StrawberrySyrup() {
        this.syrupType = "strawberry";
    }
    @Override
    public String getSyrupType() {
        return this.syrupType;
    }
}
