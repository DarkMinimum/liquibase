package ua.darkminimum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.darkminimum.models.Person;
import ua.darkminimum.repo.PersonRepository;

@Controller
public class MainController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    @ResponseBody
    public Iterable<Person> hello(){

//        Iterable<Person> persons = personRepository.findAll();
//        StringBuilder result = new StringBuilder();
//
//        for (Person person: persons) {
//            result.append(person.toString());
//            result.append("<br>");
//        }

        return personRepository.findAll();//result.toString();
    }
}