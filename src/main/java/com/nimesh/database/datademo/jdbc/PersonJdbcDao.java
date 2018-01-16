package com.nimesh.database.datademo.jdbc;


import com.nimesh.database.datademo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Person> findAll(){
        return jdbcTemplate.query("Select * from person", new BeanPropertyRowMapper<>(Person.class));

    }
    public Person findById(int id){
        return jdbcTemplate.queryForObject("Select * from person WHERE id=?",new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));

    }
    public List<Person> findByLocation(String location){
        return jdbcTemplate.query("Select * from person WHERE location=?",new Object[]{location}, new BeanPropertyRowMapper<>(Person.class));

    }
    public int deleteById(int id){
        return jdbcTemplate.update("Delete from person where id =?",new Object[]{id});

    }
    public int insert(Person person){
        return jdbcTemplate.update("Insert into PERSON(id,name,location) VALUES (?,?,?)",
                new Object[]{person.getId(),person.getName(),person.getLocation()});
    }
    public int updateById(int id,String name){
        return jdbcTemplate.update("Update PERSON set NAME=? where id = ?",new Object[]{name,id});
    }
}
