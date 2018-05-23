package com.cache.training.services;

import com.cache.training.entity.MyEmployees;

public interface MyLoginDetailsService {
	
	MyEmployees getMyLoginDetails(String userName,String password);

}
