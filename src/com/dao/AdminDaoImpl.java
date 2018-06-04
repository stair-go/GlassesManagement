package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.domain.Admin;
import com.domain.Customer;
import com.domain.Fatie;
import com.opensymphony.xwork2.ActionContext;


public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao{
	

	
	/**
	 * 查询用户.以便登录
	 */
	public Admin findByNameAndPass(String username, String password) {
		List<Admin> list=(List<Admin>) this.getHibernateTemplate().find("from Admin where username=? and password=? ", username,password);
		if(list.size()> 0){
			return list.get(0);
		}
		return null;
	}
	/**
	 * 添加用户
	 */
	public void addAdmin(Admin admin) {
		List<Admin> list=(List<Admin>) this.getHibernateTemplate().find("from Admin where username=? and password=? ", admin.getUsername(),admin.getPassword());
		if(list.size()==0){
			this.getHibernateTemplate().saveOrUpdate(admin);
		}
	}
	/**
	 * 修改用户
	 */
	public void save(Admin admin){
		this.getHibernateTemplate().saveOrUpdate(admin);
	}
	public void fatie(Fatie fatie) {
		this.getHibernateTemplate().save(fatie);
	}
	public List<Fatie> findFtlist() {
		return (List<Fatie>) this.getHibernateTemplate().find("from Fatie order by dateTime");
	}
	public Fatie findFtByid(Long id) {
		
		return this.getHibernateTemplate().get(Fatie.class, id);
	}
	public List<Admin> findAdminList() {
		return (List<Admin>) this.getHibernateTemplate().find("from Admin");
	}
	public void deleteFT(Fatie fatie2) {
		this.getHibernateTemplate().delete(fatie2);
	}
	public Admin findAdminById(Long admin_id) {
		return this.getHibernateTemplate().get(Admin.class,admin_id);
	}
	public List<Customer> findClist(Long admin_id) {
		return (List<Customer>) this.getHibernateTemplate().find("from Customer where a_c_id=?  order by dateNowStr desc", admin_id);
	}
	public List<Customer> findClistByName(Long admin_id, String username) {
		return (List<Customer>) this.getHibernateTemplate().find("from Customer where a_c_id=? and username like ? order by dateNowStr desc", admin_id,"%"+username+"%");
	}
	public List<Customer> findClistBydate(Long admin_id, String stardate, String enddate) {
		return (List<Customer>) this.getHibernateTemplate().find("from Customer where a_c_id=? and dateNowStr > ? and dateNowStr< ? order by dateNowStr desc", admin_id,stardate,enddate);
	}



	

	
	

}
