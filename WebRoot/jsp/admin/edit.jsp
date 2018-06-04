<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/admin_sucedit.action"
		method=post>
		<input type="hidden" name="admin_id" value="${admin.admin_id}"/>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background=${pageContext.request.contextPath }/images/new_020.jpg
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：个人管理 &gt; 修改个人信息</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0 style="width: 692px; height: 256px; ">
							<TR>
						  		<td colspan="4"align="center" style="">
						  			<font size="3px" color="red">个人信息</font>
						  		</td>
						  	</TR>
						    
							<TR>
								<td style=" font-size: 18px;">姓名 ：</td>
								<td>
								<INPUT class="form-control" id=sChannel2
														style="WIDTH: 200px; height:22px; font-size: 18px;" maxLength=50 name="username" value="${admin.username }"
														placeholder="输入姓名" required autofocus>
								</td>
								<td style=" font-size: 18px;">密码：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 200px; height:22px; font-size: 18px;"  name="password" value="${admin.password}">
								
								</td>
							
							</TR>
							<TR>
							
								<td style=" font-size: 18px;">年龄 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 200px; height:22px; font-size: 18px;" maxLength=50 name="age" value="${admin.age }">
								</td>
								<td style=" font-size: 18px;">地址 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
											style="WIDTH: 200px; height:22px; font-size: 18px;" maxLength=50 name="address" value="${admin.address }">
								</td>
							</TR>
							<TR>
							
								<td style=" font-size: 18px;">店名 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 200px; height:22px; font-size: 18px;" maxLength=50 name="sdean" value="${admin.sdean }">
								</td>
								<td style=" font-size: 18px;">联系电话 ：</td>
								<td>
									<INPUT class=textbox id=sChannel2
											style="WIDTH: 200px; height:22px; font-size: 18px;" maxLength=50 name="phone" value="${admin.phone }">
								</td>
							</TR>
							
							
							
							<tr>
							<td style=" font-size: 18px;">登录密令：</td>
								<c:if test="${admin.username==('admin吴智辉')}">
									<td>
									<INPUT type="text"   id=sChannel2
														style="WIDTH: 200px; height:22px; font-size: 18px; color: blue;" maxLength=50 name="mimi" value="${admin.mimi }">
									</td>
								</c:if>
								<c:if test="${admin.username!=('admin吴智辉')}">
									<td>
								<INPUT type="text"  disabled="true" id=sChannel2
														style="WIDTH: 200px; height:22px; font-size: 18px; color: blue;" maxLength=50 name="mimi" value="${admin.mimi }">
									</td>
								</c:if>
								<td>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								<td/>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
