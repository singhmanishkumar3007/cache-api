package com.cache.training.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cache.training.entity.MyEmployees;
import com.cache.training.repository.MyEmployeesRepository;

@Component
public class MyEmployeesDao {

	@Autowired
	private MyEmployeesRepository myEmployeesRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(MyEmployeesDao.class);

	public MyEmployees getEmployeesFromDB(String userName, String password) {
		LOGGER.info("inside DAO Layer to fetch details from DB ");
		return myEmployeesRepository.findByUserNameAndPassword(userName, password);
	}

}
