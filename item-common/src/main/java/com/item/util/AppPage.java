/**
 * @filename:Const 2018年6月30日
 * @project 紫马 边鹏  V1.0
 * Copyright(c) 2017 BianP Co. Ltd. 
 * All right reserved. 
 */
package com.item.util;

import java.io.Serializable;

/**
 * app分页组件
 * @author bianP
 * @version $Id: AppPage.java, v 0.1 2018年06月20日 下午2:31:23 
 */
public class AppPage<T>  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
     * 当前页
     */
    private int pageNum=1;
    /**
     * 每页记录数
     */
    private int pageSize=10;
    /**
     * 总页数
     */
    private int pageAmount;
    /**
     * 总记录数
     */
    private long totalAmount;
    /**
     * 分页外的其它参数
     */
    private T param;
    
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageAmount() {
        return pageAmount;
    }
    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }
    public long getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }
	public T getParam() {
		return param;
	}
	public void setParam(T param) {
		this.param = param;
	}
    
}
