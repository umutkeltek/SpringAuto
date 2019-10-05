package luv.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Qualifier("firstService")
@Component
public class RandomFortuneService implements FortuneService {
    private String [] fortunes = {"Nice Day" ,"You need be careful", "Wonderful Day!",
            "Not good, not bad..."};
    private Random rand = new Random();


    @Override
    public String getFortuneService() {
        int index = rand.nextInt(fortunes.length);
        return fortunes [index] ;
    }
}
