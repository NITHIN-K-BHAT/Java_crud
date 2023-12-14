package com.example.crudd_again.service;

#packages
import com.example.crudd_again.dao.PersonDao;
import com.example.crudd_again.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public String upsert(Person person){
        personDao.save(person);
        return "success";
    }

    public List<Person>getAll(){
        return personDao.findAll();
    }

    public Person getById(Integer id){
        return personDao.findById(id).get();
    }

    public String delById(Integer id){
        personDao.deleteById(id);
        return "success";
    }

    public List<Person>getPersonByBatch(String batch){
        return personDao.findPersonByBatch(batch);
    }



}
