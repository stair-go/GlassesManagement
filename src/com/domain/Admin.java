package com.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 代表管理员的 Javabean
 * @author Administrator
 *
 */
public class Admin {
	private Long admin_id;       //ID
	private String username;   //登录名
	private String password;   //密码
	private Long age;       //年龄
	private Long phone;     //联系电话
	private String sdean;   //公司
	private String address; //地址
	private String mimi;	//密令
	private String date;
	
	public Admin(){
		if (getDate()==null) {
			this.date=new SimpleDateFormat("yyyy-MM-dd ss").format(Calendar.getInstance().getTime());
		}
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}

	public String getMimi() {
		return mimi;
	}
	public void setMimi(String mimi) {
		this.mimi = mimi;
	}
	
	private Set <Customer> customers=new HashSet<Customer>();
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public Long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getSdean() {
		return sdean;
	}
	public void setSdean(String sdean) {
		this.sdean = sdean;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
