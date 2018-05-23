package com.cache.training.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cache.training.dao.MyEmployeesDao;
import com.cache.training.entity.MyEmployees;

@Service
public class MyLoginDetailsServiceImpl implements MyLoginDetailsService {

	@Autowired
	private MyEmployeesDao myEmployeesDao;

	private static final Logger LOGGER = LoggerFactory.getLogger(MyLoginDetailsServiceImpl.class);

	@Override
	@Cacheable(value="getEmployeesByCache", key="#userName", unless = "#result==null")
	public MyEmployees getMyLoginDetails(String userName, String password) {

		MyEmployees myDetails;
		LOGGER.info("inside MyLoginDetailsServiceImpl to fetch data");
		myDetails = myEmployeesDao.getEmployeesFromDB(userName, password);
		LOGGER.info("Data Received from DB {} ", myDetails);
		return myDetails;
	}

}
