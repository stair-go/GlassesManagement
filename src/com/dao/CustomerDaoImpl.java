package com.dao;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.domain.Customer;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	public void save(Customer customer) {
		this.getHibernateTemplate().saveOrUpdate(customer);
	}

	public Customer getCustomerById(Long id) {
		return this.getHibernateTemplate().get(Customer.class, id);
	}
	
	public void update(Customer customer){
		this.getHibernateTemplate().merge(customer);
	}

	public void delete(Customer customer2) {
		this.getHibernateTemplate().delete(customer2);
	}
	
	
}
