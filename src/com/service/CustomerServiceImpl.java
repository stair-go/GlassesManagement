package com.service;


import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.domain.Customer;
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public void save(Customer customer) {
		customerDao.save(customer);
	}
	public Customer getCustomerById(Long id) {
		return customerDao. getCustomerById(id);
	}
	public void update(Customer customer) {
		customerDao.update(customer);
	}
	public void delete(Customer customer2) {
		customerDao.delete(customer2);
	}
	
	
}
