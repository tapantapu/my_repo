package com.tkp.sbrestfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tkp.sbrestfirst.model.Person;

@RestController
public class PersionController {

	@Autowired
	private Person person;

	@RequestMapping
	public String healthCheck() {
		return "OK";
	}

	@RequestMapping("/person/get")
	public Person getPerson(@RequestParam(name = "name", required = false, defaultValue = "Unknown") String name,
			@RequestParam(name = "id", required = false, defaultValue = "Unknown") int id) {
		person.setName(name);
		person.setId(id);
		return person;
	}

	//@RequestMapping(value = "/person/update", method = RequestMethod.POST)
	@PostMapping(value = "/person/update")
	public Person updatePerson(@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "id", required = true) int id) {
		person.setName(name);
		person.setId(id);
		return person;
	}
	
	
	//Json
	//@RequestMapping(value="/person/update", method=RequestMethod.POST, consumes = "application/json")
	@PostMapping(value="/person/update", consumes = "application/json")
	public Person updatePerson(@RequestBody Person p) {
	person.setName(p.getName());
	person.setId(p.getId());
	return person;
}
}
