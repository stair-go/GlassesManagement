package com.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;

import com.dao.CustomerDao;
import com.domain.Admin;
import com.domain.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.CustomerService;
/**
 * 操作图书的action
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	//创建Javabean对象
	private Customer customer=new Customer();
	/**
	 * 获取请求输入的对象
	 */
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	public String save(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		Admin admin2= (Admin) context.get("user");
		customer.setAdmin(admin2);
		customerService.save(customer);
		context.put("user", admin2);
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈对象
		vs.set("customer",customer); 		
		return "see";
	}
	
	
	
	/**
	 * 初始化修改,并传递到修改页面
	 * @return
	 */
	public String initedit(){
		System.out.println("-----------*********************-----------");
		Customer customer2= customerService.getCustomerById(customer.getId());
		System.out.println(customer.getId());	//打印获取到客户的名字[方便调试代码,可无视]
		
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈对象
		vs.set("customer",customer2); 									//压入客户对象
		return "initedit";
	}
	
	public String edit(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		Admin admin2= (Admin) context.get("user");
		customer.setAdmin(admin2);
		customerService.update(customer);
		return SUCCESS;
	}
	public String see(){
		System.out.println("-----------*********************-----------");
		Customer customer2= customerService.getCustomerById(customer.getId());
		System.out.println(customer.getId());	//打印获取到客户的名字[方便调试代码,可无视]
		
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈对象
		vs.set("customer",customer2); 									//压入客户对象
		return "see";
	}
	public String delete(){
		Customer customer2= customerService.getCustomerById(customer.getId());
		customerService.delete(customer2);
		return SUCCESS;
	}
	

	public String select(){
		
		
		return null;
	}
	
	
}
