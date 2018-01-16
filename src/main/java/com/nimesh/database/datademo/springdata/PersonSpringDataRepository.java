package com.nimesh.database.datademo.springdata;

import com.nimesh.database.datademo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PersonSpringDataRepository extends JpaRepository<Person,Integer>{

    public Person findByLocationOrName(String location, String name);

    public int countDistinctByLocation(String location);
}
