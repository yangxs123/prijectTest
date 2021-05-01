package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	
    @Autowired
    private PersonService personService;
    
	@RequestMapping("/add")
	public String add() {
        Person person = new Person();
       // person.setId(1);
        person.setName("java的架构师技术栈");
        person.setAge(18);
        int result = personService.insertPerson(person);
        System.out.println("插入的结果是："+result);
        return result+"";
	}
	
    @RequestMapping(value = "/findAll")
    public String findAll () {
        List<Person> people = personService.selectAllPerson();
        people.stream().forEach(System.out::println);
        return people.toString()+"";
    }
}
