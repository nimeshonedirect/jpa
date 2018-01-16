package com.nimesh.database.datademo.Repository;


import com.nimesh.database.datademo.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository  {

    @PersistenceContext
    EntityManager entityManager;
    public Person findById(int id){
        return entityManager.find(Person.class,id);
    }
    public Person update(Person person){
        return entityManager.merge(person);
    }
    public Person insert(Person person){
        return entityManager.merge(person);
    }
    void deleteById(int id){
        Person person = findById(id);
        entityManager.remove(person);
    }

}
