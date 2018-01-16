package com.nimesh.database.datademo;

import com.nimesh.database.datademo.entity.Person;

import com.nimesh.database.datademo.springdata.PersonSpringDataRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class DatademoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository dao;
	public static void main(String[] args) {
		SpringApplication.run(DatademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info("All users -> {}",dao.findAll());
		Person person = new Person(100,"Nimesh Kjio","Kanpur");
		person = dao.save(person);
		Person person2 = new Person(2,"Nimesh Khande","Kanpur");
		person2 = dao.save(person2);
		logger.info("Find all data ->{}",dao.findAll());
		logger.info("Find by location and we have get record -> {}",dao.findById(2));
		//dao.insert(person);
		//dao.updateById(2,"Anmol");
		logger.info("All users -> {}",dao.findAll());
	}
}
