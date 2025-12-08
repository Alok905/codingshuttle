package com.bakery.module1task;

import com.bakery.module1task.frosting.Frosting;
import com.bakery.module1task.syrup.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    public Frosting cakeFrosting;
    @Autowired
    public Syrup cakeSyrup;

    public void bakeCake() {
        System.out.println("Baking the cake with: ");
        System.out.println("Syrup: " + this.cakeSyrup);
        System.out.println("Frosting: " + this.cakeFrosting);
    }
}
