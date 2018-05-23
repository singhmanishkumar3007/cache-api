package com.cache.training.repository;

import org.springframework.data.repository.CrudRepository;

import com.cache.training.entity.MyEmployees;

public interface MyEmployeesRepository extends CrudRepository<MyEmployees, Integer> {

	MyEmployees findByUserNameAndPassword(String userName, String password);

}
