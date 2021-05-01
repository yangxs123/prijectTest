package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Person;
import com.example.demo.mapper.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;
    
	@Override
	public int insertPerson(Person person) {
		// TODO Auto-generated method stub
		return personMapper.insert(person);
	}

	@Override
	public int deleteByPersonId(Integer id) {
		// TODO Auto-generated method stub
		return personMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPersonId(Person record) {
		// TODO Auto-generated method stub
		return personMapper.updateByPrimaryKey(null);
	}

	@Override
	public Person selectByPersonId(Integer id) {
		// TODO Auto-generated method stub
		return personMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Person> selectAllPerson() {
		// TODO Auto-generated method stub
		return personMapper.selectAllPerson();
	}

}
