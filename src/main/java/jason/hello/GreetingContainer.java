package jason.hello;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class GreetingContainer {
    private static List<Greeting> testList = new ArrayList<>();

    public static List<Greeting> getTestList(){
        return testList;
    }

    public static Greeting getOne(String id, HttpStatus ok){
        return testList.get(Integer.parseInt(id));
    }

    public static void addToList(Greeting greeting){
        testList.add(greeting);
    }
}
