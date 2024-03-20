package com.crudperson.people.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudperson.people.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
