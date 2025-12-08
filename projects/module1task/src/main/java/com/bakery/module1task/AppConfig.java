package com.bakery.module1task;

import com.bakery.module1task.frosting.ChocolateFrosting;
import com.bakery.module1task.frosting.Frosting;
import com.bakery.module1task.frosting.StrawberryFrosting;
import com.bakery.module1task.syrup.ChocolateSyrup;
import com.bakery.module1task.syrup.StrawberrySyrup;
import com.bakery.module1task.syrup.Syrup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /* it'll create bean with the name "syrup" --------- */
    @Bean
    public Syrup syrup() {
        return new ChocolateSyrup();
    }

    /* it'll create bean with the name "frosting" --------- */
    @Bean
    public Frosting frosting() {
        return new ChocolateFrosting();
    }

    /* the above created bean will be injected in below. the bean name will be "cakeBaker" --------- */
    @Bean
    public CakeBaker cakeBaker(Frosting frosting, Syrup syrup) {
        return new CakeBaker(frosting, syrup);
    }

//    @Bean
//    public ChocolateSyrup chocolateSyrup() {
//        return new ChocolateSyrup();
//    }
//    @Bean
//    public ChocolateFrosting chocolateFrosting() {
//        return new ChocolateFrosting();
//    }
//    @Bean
//    public StrawberrySyrup strawberrySyrup() {
//        return new StrawberrySyrup();
//    }
//    @Bean
//    public StrawberryFrosting strawberryFrosting() {
//        return new StrawberryFrosting();
//    }

}
