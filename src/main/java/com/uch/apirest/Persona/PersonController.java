package com.uch.apirest.Persona;

import com.uch.apirest.Persona.Person;
import com.uch.apirest.Persona.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<String> createPersona(@RequestBody Person person) {
        try {
            personService.createPersona(person);
            return ResponseEntity.ok("Persona creada correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al crear persona: " + e.getMessage());
        }
    }

    @GetMapping
    public List<Person> getAllPersonas() {
        return personService.getAllPersonas();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Integer id) {
        try {
            personService.deletePersonById(id);
            return ResponseEntity.ok("Persona eliminada correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al eliminar persona: " + e.getMessage());
        }
    }
}

