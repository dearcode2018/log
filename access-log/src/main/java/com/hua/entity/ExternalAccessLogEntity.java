/**
  * @filename ExternalAccessLogEntity.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.entity;

import java.util.Date;

 /**
 * @type ExternalAccessLogEntity
 * @description 外部访问日志
 * @author qianye.zheng
 */
public class ExternalAccessLogEntity
{
	
	/* 主键ID */
	private Integer id;
	
	/* 业务ID, 一个请求对应一个业务ID */
	private String businessId;	
	
	/* 访问编号，让调用方携带该参数来识别不同的配置 */
	private String accessCode;
	
	/* 请求参数(json/xml)' */
	private String requestParam;
	
	/* 响应结果 */
	private String responseResult;
	
	/* 请求地址(IP) */
	private String requestAddr;
	
	/* 持续秒数 */
	private Integer endureSecond;
	
	/* 备注 */
	private String remark;
	
	/* 访问时间 */
	private Date createDate;

	/**
	 * @return the id
	 */
	public final Integer getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id)
	{
		this.id = id;
	}

	/**
	 * @return the accessCode
	 */
	public final String getAccessCode()
	{
		return accessCode;
	}

	/**
	 * @param accessCode the accessCode to set
	 */
	public final void setAccessCode(String accessCode)
	{
		this.accessCode = accessCode;
	}

	/**
	 * @return the requestParam
	 */
	public final String getRequestParam()
	{
		return requestParam;
	}

	/**
	 * @param requestParam the requestParam to set
	 */
	public final void setRequestParam(String requestParam)
	{
		this.requestParam = requestParam;
	}

	/**
	 * @return the responseResult
	 */
	public final String getResponseResult()
	{
		return responseResult;
	}

	/**
	 * @param responseResult the responseResult to set
	 */
	public final void setResponseResult(String responseResult)
	{
		this.responseResult = responseResult;
	}

	/**
	 * @return the requestAddr
	 */
	public final String getRequestAddr()
	{
		return requestAddr;
	}

	/**
	 * @param requestAddr the requestAddr to set
	 */
	public final void setRequestAddr(String requestAddr)
	{
		this.requestAddr = requestAddr;
	}

	/**
	 * @return the endureSecond
	 */
	public final Integer getEndureSecond()
	{
		return endureSecond;
	}

	/**
	 * @param endureSecond the endureSecond to set
	 */
	public final void setEndureSecond(Integer endureSecond)
	{
		this.endureSecond = endureSecond;
	}

	/**
	 * @return the remark
	 */
	public final String getRemark()
	{
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public final void setRemark(String remark)
	{
		this.remark = remark;
	}

	/**
	 * @return the createDate
	 */
	public final Date getCreateDate()
	{
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public final void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	/**
	 * @return the businessId
	 */
	public final String getBusinessId()
	{
		return businessId;
	}

	/**
	 * @param businessId the businessId to set
	 */
	public final void setBusinessId(String businessId)
	{
		this.businessId = businessId;
	}
	
}
