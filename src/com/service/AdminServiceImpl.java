package com.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdminDao;
import com.domain.Admin;
import com.domain.Customer;
import com.domain.Fatie;
@Transactional
public class AdminServiceImpl implements AdminService{
	
	
	
	/**
	 * 注入Dao层Admin
	 */
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	/**
	 * 查找用户,登录
	 */
	public Admin findByNameAndPass(String username, String password) {
		return adminDao.findByNameAndPass(username, password);
	}

	/**
	 * 添加ADMIN
	 */
	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}
	/**
	 * 修改
	 */
	public void save(Admin admin2) {
		adminDao.save(admin2);
	}
	public void fatie(Fatie fatie) {
		adminDao.fatie(fatie);
	}
	public List<Fatie> findFtlist() {
		return adminDao.findFtlist();
	}
	public Fatie findFtByid(Long id) {
		return adminDao.findFtByid(id);
	}
	public List<Admin> findAdminList() {
		return adminDao.findAdminList();
	}
	public void deleteFT(Fatie fatie2) {
		adminDao.deleteFT(fatie2);
	}
	public Admin findAdminById(Long admin_id) {
		return adminDao.findAdminById(admin_id);
	}
	@Override
	public List<Customer> findClist(Long admin_id) {
		// TODO Auto-generated method stub
		return adminDao.findClist(admin_id);
	}
	public List<Customer> findClistByName(Long admin_id, String username) {
		return adminDao.findClistByName(admin_id, username);
	}
	public List<Customer> findClistBydate(Long admin_id, String stardate, String enddate) {
		return adminDao.findClistBydate(admin_id, stardate, enddate);
	}
	

}
