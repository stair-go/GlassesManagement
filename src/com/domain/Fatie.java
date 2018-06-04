package com.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 代表管理员的 Javabean
 * @author Administrator
 *
 */
public class Fatie {
	private Long id;       //ID
	private String username;   //登录名
	private String texthead;	//标题
	private String text;   //内容
	private Date dateTime = new Date();
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
	public String getTexthead() {
		return texthead;
	}
	public void setTexthead(String texthead) {
		this.texthead = texthead;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
