package com.web.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.domain.Admin;
import com.domain.Customer;
import com.domain.PageShow;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.AdminService;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	
	private int pageNow = 1;// 动态改变 页面取得  
    private int pageSize = 15;// 固定不变 
    private String stardate;
    private String enddate;
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public String getStardate() {
		return stardate;
	}
	public void setStardate(String stardate) {
		this.stardate = stardate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	/**
	 * 获取用户
	 */
	Admin admin=new Admin();
	public Admin getModel() {
		return admin;
	}
	/**
	 * admin控制层接口
	 */
	AdminService adminService;
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	/**
	 * 登录功能,获取传递的Model,再通过DAO层,判断是否有这个用户
	 * @return
	 */
	public String login(){
		Admin admin2 = adminService.findByNameAndPass(admin.getUsername(), admin.getPassword());
		Map<String, Object> context = ActionContext.getContext().getSession();
		if(admin2==null){
			ValueStack valueStack = ActionContext.getContext().getValueStack();
			valueStack.set("msg", "用户名或密码错误,请重新输入");
			return "againenter";
		}
		else if (admin2.getUsername().equals("admin吴智辉")&&admin2.getPassword().equals("admin")) {
			context.put("level", 10);
		}
		context.put("user", admin2);
		return "login";
	}
	
	/**
	 * 注册
	 */
	public String logintwo(){
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		if(admin.getUsername().equals("admin吴智辉")&&admin.getPassword().equals("admin")){
			adminService.addAdmin(admin);
			return login();
		}
		if(admin.getMimi().equals(adminService.findByNameAndPass("admin吴智辉", "admin").getMimi())){
			adminService.addAdmin(admin);
			return login();
		}
		else {
			valueStack.set("msg", "密令错误,请微信联系15717005103获取密令");
			return "loginerror";
		}
	}
	
	/**
	 * 修改用户初始化
	 */
	public String edit(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		Admin admin2=adminService.findAdminById(admin.getAdmin_id());
		valueStack.set("admin", admin2);
		return "initedit";
	}
	/**
	 * 修改用户
	 */
	public String sucedit(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		Admin admin2=adminService.findAdminById(admin.getAdmin_id());
		admin2.setAddress(admin.getAddress());
		admin2.setAge(admin.getAge());
		admin2.setDate(admin.getDate());
		admin2.setMimi(admin.getMimi());
		admin2.setPassword(admin.getPassword());
		admin2.setPhone(admin.getPhone());
		admin2.setSdean(admin.getSdean());
		admin2.setUsername(admin.getUsername());
		adminService.save(admin2);
		context.put("user", admin2);
		return SUCCESS;
	}
	/**
	 * 获取所有客户信息的list,并存储到值栈中
	 * @return
	 */
	
	public String list(){
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Map<String, Object> context = ActionContext.getContext().getSession();
		Admin admin2= (Admin) context.get("user");
		Admin admin3=adminService.findByNameAndPass(admin2.getUsername(), admin2.getPassword());
		List<Customer> list=adminService.findClist(admin2.getAdmin_id());
		PageShow page = new PageShow(pageNow,list.size(), pageSize);// 实例化分页对象  
		List<Customer>list2=new ArrayList<Customer>();
		Iterator<Customer> iterator = list.iterator();
		if((pageNow)*pageSize<list.size()){
			for(int i=(pageNow-1)*pageSize;i<(pageNow)*pageSize;i++){
					list2.add(list.get(i));
			}
		}
		else {
			for(int i=(pageNow-1)*pageSize;i<list.size();i++){
				list2.add(list.get(i));
			}
		}
		context.put("user", admin3);
		vs.set("page", page);
		vs.set("list", list2);							//将值传入值栈
		return "list";												//返回结果
	}
	
	public String listadmin(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		List<Admin>list = adminService.findAdminList();
		
		vs.set("list", list);		
		return "listadmin";	
	}
	
	public String select(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Admin admin2= (Admin) context.get("user");
		Admin admin3=adminService.findByNameAndPass(admin2.getUsername(), admin2.getPassword());
		List<Customer> list=adminService.findClistByName(admin2.getAdmin_id(),admin.getUsername());
		context.put("user", admin3);
		vs.set("list", list);							//将值传入值栈
		return "list";
	}
	public String select2(){
		Map<String, Object> context = ActionContext.getContext().getSession();
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Admin admin2= (Admin) context.get("user");
		Admin admin3=adminService.findByNameAndPass(admin2.getUsername(), admin2.getPassword());
		List<Customer> list=adminService.findClistBydate(admin2.getAdmin_id(),stardate,enddate);
		int zjq=0;
		for (Customer customer : list) {
			zjq+=customer.getPrice();
		}
		context.put("user", admin3);
		vs.set("zjq", zjq);
		vs.set("list", list);							//将值传入值栈
		return "list2";
	}
	public String listdelete(){
		ValueStack vs = ActionContext.getContext().getValueStack();  //获取值栈
		Map<String, Object> context = ActionContext.getContext().getSession();
		Admin admin2= (Admin) context.get("user");
		Admin admin3=adminService.findByNameAndPass(admin2.getUsername(), admin2.getPassword());
		List<Customer> list=adminService.findClist(admin2.getAdmin_id());
		PageShow page = new PageShow(pageNow,list.size(), pageSize);// 实例化分页对象  
		List<Customer>list2=new ArrayList<Customer>();
		Iterator<Customer> iterator = list.iterator();
		if((pageNow)*pageSize<list.size()){
			for(int i=(pageNow-1)*pageSize;i<(pageNow)*pageSize;i++){
					list2.add(list.get(i));
			}
		}
		else {
			for(int i=(pageNow-1)*pageSize;i<list.size();i++){
				list2.add(list.get(i));
			}
		}
		context.put("user", admin3);
		vs.set("page", page);
		vs.set("list", list2);							//将值传入值栈
		return "listdelete";												//返回结果
	}
}
