package luv.spring.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("secondService")
@Component
public class GoodFortune implements FortuneService {
    @Override
    public String getFortuneService() {
        return "DONT WORRY BE HAPPY";
    }
}
