package example.controler;

import example.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import example.repository.PersonRepository;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        Person person = new Person();
        person.setFirstName("First");
        person.setLastName("Test");
        personRepository.save(person);
        return "hello";
    }
}