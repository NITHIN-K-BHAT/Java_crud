package com.example.crudd_again.dao;

import com.example.crudd_again.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer> {

    List<Person> findPersonByBatch(String batch);
}
