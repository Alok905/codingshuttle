package com.bakery.module1task;

import com.bakery.module1task.frosting.ChocolateFrosting;
import com.bakery.module1task.frosting.Frosting;
import com.bakery.module1task.frosting.StrawberryFrosting;
import com.bakery.module1task.syrup.ChocolateSyrup;
import com.bakery.module1task.syrup.StrawberrySyrup;
import com.bakery.module1task.syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    /* it'll create bean with the name "chocolateSyrup" --------- */
    @Bean
    @ConditionalOnProperty(value = "syrup.type", havingValue = "chocolate")
    public Syrup chocolateSyrup() {
        return new ChocolateSyrup();
    }

    /* it'll create bean with the name "strawberrySyrup" --------- */
    @Bean
    @ConditionalOnProperty(value = "syrup.type", havingValue = "strawberry")
    public Syrup strawberrySyrup() {
        return new StrawberrySyrup();
    }

    /* it'll create bean with the name "chocolateFrosting" --------- */
    @Bean
    @ConditionalOnProperty(value = "frosting.type", havingValue = "chocolate")
    public Frosting chocolateFrosting() {
        return new ChocolateFrosting();
    }

    /* it'll create bean with the name "strawberryFrosting" --------- */
    @Bean
    @ConditionalOnProperty(value = "frosting.type", havingValue = "strawberry")
    public Frosting strawberryFrosting() {
        return new StrawberryFrosting();
    }

    /* the above created bean will be injected in below. the bean name will be "cakeBaker" --------- */
    @Bean
    public CakeBaker cakeBaker(Frosting frosting, Syrup syrup) {
        return new CakeBaker(frosting, syrup);
    }


}
