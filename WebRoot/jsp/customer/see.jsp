<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加联系人</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>

<script language="javascript">
function preview(oper)
{
	if (oper < 10){
	bdhtml=window.document.body.innerHTML;//获取当前页的html代码
	sprnstr="<!--startprint-->";//设置打印开始区域
	eprnstr="<!--endprint-->";//设置打印结束区域
	prnhtml=bdhtml.substring(bdhtml.indexOf(sprnstr)); //从开始代码向后取html
	prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr));//从结束代码向前取html
	window.document.body.innerHTML=prnhtml;
	window.print();
	window.document.body.innerHTML=bdhtml;
	} else {
	window.print();
	}
	}
</script>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>

<BODY>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/customer_edit.action"
		method=post>
		<input type="hidden" name="id" value="${customer.id }"/>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff style="width: 1536px; height: 448px; ">
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：顾客管理 &gt; 查看顾客</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<!--startprint-->	
						<TABLE cellSpacing=0 cellPadding=5  border=0 >
								<TR>
						  		<td colspan="4"align="center" style="width: 639px; ">
						  			<font size="5px" color="red">${user.sdean}</font>
						  		</td>
						  	</TR>
							<TR>
								<td style="font-size: 18px;">姓名 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text"  align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.username}">
								</td>
								<td style=" font-size: 18px;">联系电话：</td>
								<td align="center"style=" font-size: 18px; ">
									<input align="middle" type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.phone}">
								</td>
							
							</TR>
							<TR>
							
								<td style=" font-size: 18px;">年龄 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.age}">
								</td>
								<td style=" font-size: 18px;">地址 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" style="border:none;border-bottom:black solid 1px; font-size: 18px;" value="${customer.address}">
								</td>
							</TR>
							<TR>
								
								<td style=" font-size: 18px;">右眼度数：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.righteye}">
								</td>
								<td style=" font-size: 18px;">左眼度数 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.lefteye}">
								</td>
							</TR>
							<TR>
								
								<td style=" font-size: 18px;">右眼瞳距：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"   value="${customer.sgrighteye}"> 
								</td>
								<td style=" font-size: 18px;">左眼瞳距 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.sglefteye}">
								</td>
							</TR>
							<TR>
								<td style=" font-size: 18px;">总瞳距 ：</td>
								<td align="center"style=" font-size: 18px; ">
									 <input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.ztj}">	
								</td>
								<td style=" font-size: 18px;">下加光：</td>
								<td align="center"style=" font-size: 18px; ">
									 <input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.xjg}">
								</td>
							</TR>
							<TR>
								<td style=" font-size: 18px;">镜架 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.glasses}">
								</td>
								<td style=" font-size: 18px;">镜架价格 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.glassesprice}">
											
								</td>
								
							</TR>
							<TR>
								
								<td style=" font-size: 18px;">镜片：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.lens}">
								</td>
								<td style=" font-size: 18px;">镜片价格：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.lensprice}">
								</td>
							</TR>
							<TR>
								<td style=" font-size: 18px;">总价格 ：</td>
								<td align="center"style=" font-size: 18px; ">
									<input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.price}">
											
								</td>
								<td style=" font-size: 18px;">时间 ：</td>
								<td align="center" style=" font-size: 18px; ">
									 <input type="text" align="middle" style="border:none;border-bottom:black solid 1px; font-size: 18px;"  value="${customer.dateNowStr}">
								</td>
								
							</TR>
							<tr>
								<td style=" font-size: 18px;">备注信息 ：</td>
								<td  colspan="2"  style=" font-size: 18px; ">
									<input type="text" style="border:none;border-bottom:black solid 1px; font-size: 18px;" value="${customer.notes}">
								</td>
							</tr>
							
							
						</TABLE>
						<!--endprint-->
						<div align="center" style="width: 647px; height: 79px">
							<input type=button name='button_export'  onclick=preview(1) value=打印 style="width: 119px; ">
							<input type=button  onclick="window.location='${pageContext.request.contextPath }/jsp/success.jsp'" value=确定 style="width: 108px; ">
						</div>		
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
