package com.domain;

import java.util.List;

/**
 * 分页的JavaBean
 * @author Administrator
 */
public class PageShow<T> {
	private int pageNow;//当前页  
    private int totalSize;//总条数  
    private int totalPage;//总页数  
    private int pageSize=10;//每页显示条数  
    private boolean hasPre;//是否有上一页  
    private  boolean hasNext;//是否有下一页  
    private  boolean hasFirst;//是否有首页  
    private  boolean hasLast;//是否有尾页  
    public PageShow(int pageNow,int totalSize){  
        //构造方法  
        this.setPageNow(pageNow);  
        this.setTotalSize(totalSize);     
    }  
    public PageShow(int pageNow,int totalSize,int pageSize){//可动态改变每页条数  
        //构造方法  
        this.setPageNow(pageNow);  
        this.setTotalSize(totalSize);     
        this.pageSize=pageSize;  
    }  
    public void setPageNow(int pageNow) {//得到当前页  
        this.pageNow = pageNow;  
    }  
    public int getPageNow() {  
        return pageNow;  
    }  
    public void setTotalSize(int totalSize) {//总条数   
        this.totalSize = totalSize;  
    }  
    public int getTotalSize() {  
        return totalSize;  
    }  
    public void setPageSize(int pageSize) {//每页显示条数  
        this.pageSize = pageSize;  
    }  
    public int getPageSize() {  
        return pageSize;  
    }  
    public int getTotalPage() {//总页数 = 总条数/每页显示条数  
        totalPage=this.getTotalSize()/this.getPageSize();  
        if(this.getTotalSize()%this.getPageSize()!=0){  
            totalPage++; //若余数为不0 则要多加一页  
        }  
        return totalPage;  
    }  
    public void setTotalPage(int totalPage) {  
        this.totalPage = totalPage;  
    }  
    public boolean isHasPre() {//是否有上一页   除第一页以外都有上一页  说明有首页的就有上一页  
        if(this.isHasFirst()){  
            return true;  
        }  
        else return false;  
    }  
    public void setHasPre(boolean hasPre) {  
        this.hasPre = hasPre;  
    }  
    public boolean isHasNext() {//是否有下一页   除最后一页以外都有下一页  说明有尾页的就有下一页  
        if(this.isHasLast()){  
            return true;  
        }  
        else return false;  
    }  
    public void setHasNext(boolean hasNext) {  
        this.hasNext = hasNext;  
    }  
    public boolean isHasFirst() {//是否有首页 除第一页以外都有首页  
        if(this.pageNow==1)//是第一页就没有首页  
            return false;  
        else  
            return true;  
    }  
    public void setHasFirst(boolean hasFirst) {  
        this.hasFirst = hasFirst;  
    }  
    public boolean isHasLast() {//是否有尾页  除最后一页以外都有尾页  
        if(pageNow==this.getTotalPage()){//最后一页  
            return false;     
        }else return true;  
    }  
    public void setHasLast(boolean hasLast) {  
        this.hasLast = hasLast;  
    }  
}
