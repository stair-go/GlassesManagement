package com.dao;

import java.util.List;

import com.domain.Admin;
import com.domain.Customer;
import com.domain.Fatie;



public interface AdminDao {
	
	public Admin findByNameAndPass(String username, String password);
	
	public void addAdmin(Admin admin);

	public void save(Admin admin2);

	public void fatie(Fatie fatie);

	public List<Fatie> findFtlist();

	public Fatie findFtByid(Long id);

	public List<Admin> findAdminList();

	public void deleteFT(Fatie fatie2);

	public Admin findAdminById(Long admin_id);

	public List<Customer> findClist(Long admin_id);

	public List<Customer> findClistByName(Long admin_id, String username);

	public List<Customer> findClistBydate(Long admin_id, String stardate, String enddate);
}
