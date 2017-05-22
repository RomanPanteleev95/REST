package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "hello")
public class Application {
    public static void main(String[] args) {
        GreetingContainer.addToList(new Greeting(1, "Roman"));
        GreetingContainer.addToList(new Greeting(2, "Artem"));
        GreetingContainer.addToList(new Greeting(3, "Maks"));
        GreetingContainer.addToList(new Greeting(4, "Alex"));
        SpringApplication.run(Application.class, args);
    }
}
