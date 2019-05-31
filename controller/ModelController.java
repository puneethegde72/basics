package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ModelDao;
import com.example.model.Model;

@RestController
public class ModelController
{
	@Autowired
	ModelDao modelDao;
	
	@PostMapping("/employees")
	public Model addCustomer(@Valid @RequestBody Model model)
	{
		return modelDao.save(model);
	}
	
	@GetMapping("/employees")
	public List<Model> findAllCustomer()
	{
		return modelDao.findAll();
	}
	
	@GetMapping("/notes/{id}")
	public ResponseEntity<Model> findOne(@PathVariable (value= "id") Long empid)
	{
		Model model=modelDao.findOne(empid);
		if(model==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/notes/{id}")
	public ResponseEntity<Model> updateEmployee(@PathVariable (value= "id") Long empid, @Valid @RequestBody Model modelDetails)
	{
		Model model=modelDao.findOne(empid);
		if(model==null)
		{
			return ResponseEntity.ok().build();
		}
		model.setName(modelDetails.getName());
		model.setPassword(modelDetails.getPassword());
		model.setEmail(modelDetails.getEmail());
		model.setExpertise(modelDetails.getExpertise());
		
		Model updateEmployee=modelDao.save(model);
		return ResponseEntity.ok().body(updateEmployee);
	}
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<Model> deleteById(@PathVariable (value= "id") Long empid)
	{
		Model model=modelDao.findOne(empid);
		if(model==null)
		{
			return ResponseEntity.ok().build();
		}
		modelDao.deleteById(model);
		return ResponseEntity.ok().build();
	}
}
