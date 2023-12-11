package com.example.crudd_again.controller;

import com.example.crudd_again.entity.Person;
import com.example.crudd_again.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/personAll")
    public ResponseEntity<List<Person>>personAll(){
        return new ResponseEntity<>(personService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getPerson/{personId}")
    public ResponseEntity<Person>getBypersonId(@PathVariable  Integer personId){
        return new ResponseEntity<>(personService.getById(personId),HttpStatus.OK);
    }

    @PostMapping("/addPerson")
    public ResponseEntity<String> addPerson(@RequestBody Person person){
        return new ResponseEntity<>(personService.upsert(person),HttpStatus.CREATED);
    }
    @PutMapping("/updatePerson")
    public ResponseEntity<String> updatePerson(@RequestBody Person person){
        return new ResponseEntity<>(personService.upsert(person),HttpStatus.CREATED);
    }

    @DeleteMapping("/DelByIdpPerson/{DelByPersonId}")
    public ResponseEntity<String>DelByIdpPerson(@PathVariable Integer DelByPersonId){
        return new ResponseEntity<>(personService.delById(DelByPersonId),HttpStatus.OK);

    }

    @GetMapping("/getBatch/{personBatch}")
    public ResponseEntity<List<Person>>getByBatch(@PathVariable String personBatch){
        return new ResponseEntity<>(personService.getPersonByBatch(personBatch),HttpStatus.OK);
    }

}
