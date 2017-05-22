package hello;


import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {



    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public List<Greeting> print(){
        return GreetingContainer.getTestList();
    }

    @RequestMapping("/greeting/{id}")
    public Greeting printOne(@PathVariable String id){
        return GreetingContainer.getOne(id, HttpStatus.OK);
    }


//    @RequestMapping(value = "/greeting/post", method = RequestMethod.POST)
//    public Response addOne() throws IOException {
//        File file = new File("C:\\Users\\pante\\Desktop\\test.json");
//        ObjectMapper mapper = new ObjectMapper();
//        Greeting greeting = (Greeting) mapper.readValue(new FileInputStream(file.getAbsolutePath()), Greeting.class);
//        String result = "Greeting saved: " + greeting;
//        return Response.status(200).build();
//    }


    @RequestMapping(value = "/greeting/post", method = RequestMethod.POST)
    public String addOne(File file) throws IOException {
//        File file = new File("C:\\Users\\pante\\Desktop\\test.json");
        ObjectMapper mapper = new ObjectMapper();
        Greeting greeting = (Greeting) mapper.readValue(new FileInputStream(file.getAbsolutePath()), Greeting.class);
        GreetingContainer.addToList(greeting);

        return "OK";
    }

}