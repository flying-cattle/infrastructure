/**
 * @filename:Const 2018年6月30日
 * @project 紫马 边鹏  V1.0
 * Copyright(c) 2017 BianP Co. Ltd. 
 * All right reserved. 
 */
package com.item.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * app分页组件
 * @author bianP
 * @version $Id: AppPage.java, v 0.1 2018年06月20日 下午2:31:23 
 */
@Data
public class PageParam<T>  implements Serializable{
	
	private static final long serialVersionUID = -7248374800878487522L;
	/**
     * <p>当前页</p>
     */
    private int pageNum=1;
    /**
     * <p>每页记录数</p>
     */
    private int pageSize=10;

    /**
     * <p>分页外的其它参数</p>
     */
    private T param;
    
}
