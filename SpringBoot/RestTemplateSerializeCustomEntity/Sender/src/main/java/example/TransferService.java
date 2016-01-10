package example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


import javax.annotation.PostConstruct;
import javax.print.attribute.standard.Media;

import java.util.ArrayList;
import java.util.List;

import static java.lang.invoke.MethodHandles.lookup;
import static org.apache.log4j.Logger.getLogger;

@Service
public class TransferService {

    private static final Logger LOGGER = getLogger(lookup().lookupClass());



    @PostConstruct
    public void doTransfer(){
        
        String url = "http://localhost:8090/greetings";
      

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Greeting> greeting = restTemplate.getForEntity(url, Greeting.class);
        LOGGER.info(greeting.getBody().getValue());
        

        Greeting myGreeting = new Greeting();
        myGreeting.setValue("Hey ho!");
        HttpEntity<Greeting> entity = new HttpEntity<Greeting>(myGreeting);
        restTemplate.exchange(url, HttpMethod.PUT, entity, Greeting.class);
        
    }
}
