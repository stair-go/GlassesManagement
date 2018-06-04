package com.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.domain.Admin;
import com.domain.Customer;



public interface CustomerDao {

	void save(Customer customer);

	Customer getCustomerById(Long id);

	void update(Customer customer);

	void delete(Customer customer2);

	

}
