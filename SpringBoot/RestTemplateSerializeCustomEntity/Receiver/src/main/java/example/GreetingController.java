package example;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.invoke.MethodHandles.lookup;
import static org.apache.log4j.Logger.getLogger;

@RestController
public class GreetingController {
    
    private final static Logger LOGGER = getLogger(lookup().lookupClass());

    @RequestMapping(value = "/greetings", method = RequestMethod.PUT)
    public void sayHello(@RequestBody Greeting greeting){

        LOGGER.info(greeting.getValue());
    }

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public Greeting getHallo(){

        Greeting greeting = new Greeting();
        greeting.setValue("Peace!");
        
        return greeting;
    }
}
