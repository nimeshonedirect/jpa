package com.nimesh.database.datademo.entity;

import javax.persistence.*;

@Entity
@Table(name="Person")
public class Person {
    public Person(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public Person(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
