package com.bakery.module1task;

import com.bakery.module1task.frosting.Frosting;
import com.bakery.module1task.syrup.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class CakeBaker {

    public final Frosting cakeFrosting;
    public final Syrup cakeSyrup;


    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.cakeFrosting = frosting;
        this.cakeSyrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking the cake with: ");
        System.out.println("Syrup: " + this.cakeSyrup.getSyrupType());
        System.out.println("Frosting: " + this.cakeFrosting.getFrostingType());
    }
}
