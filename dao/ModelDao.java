package com.example.dao;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Model;
import com.example.repository.ModelRepository;

public class ModelDao
{
	@Autowired
	ModelRepository modelRepository;
	
	public Model addCustomer(Model model)
	{
		return modelRepository.save(model);
	}
	
	public List<Long> findAllCustomer()
	{
		return modelRepository.findAll();
	}
	
	public Model findOne(Long empid)
	{
		return modelRepository.findOne(empid);
	}
	
	public void deleteById(Model model)
	{
		modelRepository.delete(model); 
	}

	public Model save(@Valid Model model)
	{
		return null;
	}

	public List<Model> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
