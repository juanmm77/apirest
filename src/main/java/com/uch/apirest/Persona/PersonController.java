package com.uch.apirest.Persona;

import com.uch.apirest.Persona.Person;
import com.uch.apirest.Persona.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void createPersona(@RequestBody Person person) {
        personService.createPersona(person);
    }

    @GetMapping
    public List<Person> getAllPersonas() {
        return personService.getAllPersonas();
    }
}

