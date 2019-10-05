package luv.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoachConstruct implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public FootballCoachConstruct(@Qualifier("secondService") FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String dailyWorkout() {
        return "50 Shots today and 10 km run";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
