package jason.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "jason.hello")
public class Application {
    public static void main(String[] args) {
        GreetingContainer.addToList(new Greeting(1, "Roman"));
        GreetingContainer.addToList(new Greeting(2, "Artem"));
        GreetingContainer.addToList(new Greeting(3, "Maks"));
        GreetingContainer.addToList(new Greeting(4, "Alex"));
        SpringApplication.run(Application.class, args);
    }
}
