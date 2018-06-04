package com.service;

import java.util.List;


import com.domain.Customer;

public interface CustomerService {

	void save(Customer customer);

	Customer getCustomerById(Long id);

	void update(Customer customer);

	void delete(Customer customer2);

	
	

}
