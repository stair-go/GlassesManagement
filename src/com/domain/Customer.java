package com.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 代表管理员的 Javabean
 * @author Administrator
 *
 */
public class Customer {
	 private Long id;       //ID
	 private String username;   //姓名
	 private Long phone;		//电话
	 private Integer age;			//年龄
	 private String address;	//地址
	 private String lefteye ;		//左眼
	 private String sglefteye ;	//左眼散光
	 private String righteye;		//右眼
	 private String sgrighteye;	//右眼散光
	 private String glasses;	//镜架
	 private Integer price;			//价格
	 private String lens;		//镜片
	 private String notes;		//备注
	 private String sort;  		//类别
	 private Admin admin;
	 private String dateNowStr;
	 private String glassesprice;
	 private String lensprice;
	 private String ztj; 
	 private String xjg;
	 public Customer(){
		if(getDateNowStr()==null){
			this.dateNowStr=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime());
		}
	}
	 
	
	public String getGlassesprice() {
		return glassesprice;
	}


	public void setGlassesprice(String glassesprice) {
		this.glassesprice = glassesprice;
	}


	public String getLensprice() {
		return lensprice;
	}


	public void setLensprice(String lensprice) {
		this.lensprice = lensprice;
	}


	public String getZtj() {
		return ztj;
	}


	public void setZtj(String ztj) {
		this.ztj = ztj;
	}


	public String getXjg() {
		return xjg;
	}


	public void setXjg(String xjg) {
		this.xjg = xjg;
	}


	public String getLens() {
		return lens;
	}
	
	public String getDateNowStr() {
		return dateNowStr;
	}
	public void setDateNowStr(String dateNowStr) {
		this.dateNowStr = dateNowStr;
	}
	public void setLens(String lens) {
		this.lens = lens;
	}
	
	
	


	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getLefteye() {
		return lefteye;
	}
	public void setLefteye(String lefteye) {
		this.lefteye = lefteye;
	}
	public String getSglefteye() {
		return sglefteye;
	}
	public void setSglefteye(String sglefteye) {
		this.sglefteye = sglefteye;
	}
	public String getRighteye() {
		return righteye;
	}
	public void setRighteye(String righteye) {
		this.righteye = righteye;
	}
	public String getSgrighteye() {
		return sgrighteye;
	}
	public void setSgrighteye(String sgrighteye) {
		this.sgrighteye = sgrighteye;
	}
	public String getGlasses() {
		return glasses;
	}
	public void setGlasses(String glasses) {
		this.glasses = glasses;
	}
	
	


	
	

	


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	
	
}
