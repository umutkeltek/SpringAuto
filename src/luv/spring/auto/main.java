package luv.spring.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theFootballCoach = context.getBean("footballCoachConstruct", Coach.class);
        Coach theRugbyCoach = context.getBean("rugbyCoachField", Coach.class);
        Coach theBasketballCoach = context.getBean("basketballCoachSetter", Coach.class);

        System.out.println(theFootballCoach.getDailyFortune());
        System.out.println(theBasketballCoach.getDailyFortune());
        System.out.println(theRugbyCoach.getDailyFortune());

        context.close();
    }
}
