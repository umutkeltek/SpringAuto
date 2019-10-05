package luv.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoachSetter implements Coach {


    private FortuneService fortuneService;

    public BasketballCoachSetter(){

    }

    @Autowired

    public void setFortuneService(@Qualifier("firstService") FortuneService fortuneService) {
        /*System.out.println("working");*/
        this.fortuneService = fortuneService;
    }


    @Override
    public String dailyWorkout() {
        return "20 shots today!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
