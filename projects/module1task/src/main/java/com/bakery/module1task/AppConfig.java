package com.bakery.module1task;

import com.bakery.module1task.frosting.ChocolateFrosting;
import com.bakery.module1task.frosting.Frosting;
import com.bakery.module1task.frosting.StrawberryFrosting;
import com.bakery.module1task.syrup.ChocolateSyrup;
import com.bakery.module1task.syrup.StrawberrySyrup;
import com.bakery.module1task.syrup.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    /* it'll create bean with the name "chocolateSyrup" --------- */
    @Bean
    @Qualifier("chocolate-syrup")
    public Syrup chocolateSyrup() {
        return new ChocolateSyrup();
    }

    /* it'll create bean with the name "strawberrySyrup" --------- */
    @Bean
    @Qualifier("strawberry-syrup")
    public Syrup strawberrySyrup() {
        return new StrawberrySyrup();
    }

    /* it'll create bean with the name "chocolateFrosting" --------- */
    @Bean
    @Primary
    public Frosting chocolateFrosting() {
        return new ChocolateFrosting();
    }

    /* it'll create bean with the name "strawberryFrosting" --------- */
    @Bean
    public Frosting strawberryFrosting() {
        return new StrawberryFrosting();
    }

    /* the above created bean will be injected in below. the bean name will be "cakeBaker" --------- */
    @Bean
    public CakeBaker cakeBaker(Frosting frosting, @Qualifier("strawberry-syrup") Syrup syrup) {
        return new CakeBaker(frosting, syrup);
    }


}
