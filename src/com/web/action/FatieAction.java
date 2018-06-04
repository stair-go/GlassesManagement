package com.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.CustomerDao;
import com.domain.Admin;
import com.domain.Customer;
import com.domain.Fatie;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.AdminService;
import com.service.CustomerService;
/**
 * 操作图书的action
 *
 */
public class FatieAction extends ActionSupport implements ModelDriven<Fatie>{
	private int mss;
	public int getMss() {
		return mss;
	}
	public void setMss(int mss) {
		this.mss = mss;
	}
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	//创建Javabean对象
	private Fatie fatie=new Fatie();
	/**
	 * 获取请求输入的对象
	 */
	public Fatie getModel() {
		// TODO Auto-generated method stub
		return fatie;
	}
	
	
	public String fatie(){
		adminService.fatie(fatie);
		return SUCCESS;
	}
	
	public String list(){
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Map<String, Object> context = ActionContext.getContext().getSession();
		List<Fatie> list=adminService.findFtlist();
		Admin admin2= (Admin) context.get("user");
		vs.set("list", list);
		if (admin2.getUsername().equals("admin吴智辉")) {
			vs.set("mss",'2');	
		}
		return "list";
	}
	public String see(){
		Fatie fatie2= adminService.findFtByid(fatie.getId());
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		vs.set("fatie", fatie2);	
		return "see";
	}
	
	public String delete(){
		Fatie fatie2= adminService.findFtByid(fatie.getId());
		adminService.deleteFT(fatie2);
		return SUCCESS;
	}

	
}
