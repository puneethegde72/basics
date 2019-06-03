package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Model;

public interface ModelRepository extends JpaRepository<Long, Model>
{

	Model save(Model model);

	Model findOne(Long empid);

	void delete(Model model);

}
