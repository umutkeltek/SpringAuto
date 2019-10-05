package luv.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoachField implements Coach {

    @Qualifier("firstService")
    @Autowired
    private FortuneService fortuneService;
    @Override
    public String dailyWorkout() {
        return "100 Push up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
