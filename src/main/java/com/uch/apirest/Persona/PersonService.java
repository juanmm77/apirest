package com.uch.apirest.Persona;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public void createPersona(Person person)
    {
        personRepository.save(person);
    }

    public List<Person> getAllPersonas() {
        return personRepository.findAll();
    }

}

