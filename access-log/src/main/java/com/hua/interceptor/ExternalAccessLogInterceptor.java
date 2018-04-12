/**
  * @filename ExternalAccessLogInterceptor.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hua.constant.Constant;
import com.hua.entity.ExternalAccessLogEntity;
import com.hua.mapper.ExternalAccessLogMapper;
import com.hua.util.GsonUtil;
import com.hua.util.StringUtil;

 /**
 * @type ExternalAccessLogInterceptor
 * @description 外部访问日志-拦截器
 * @author qianye.zheng
 */
public class ExternalAccessLogInterceptor implements HandlerInterceptor
{
	
	/* apache commons log */
	protected Log log = LogFactory.getLog(this.getClass().getName());
	
	@Resource
	private ExternalAccessLogMapper externalAccessLogMapper;
	
	/* 处理之前将时间戳存储起来，处理结束后和当前时间计算出持续时间 */
	private static final String BEGIN_TIME_KEY = "BEGIN_TIME_KEY";
	
	/* 业务ID, 一个请求对应一个业务ID */
	private static final String BUSINESS_ID_KEY = "BUSINESS_ID_";
	
	public static final String RETURN_OBJECT_LEU = "RETURN_OBJECT";
	
	/**
	 * @description 接收请求，处理之前
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 * @author qianye.zheng
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{
		final String accessCode = request.getHeader("accessCode");
		final String method = request.getMethod().toLowerCase();
		final ExternalAccessLogEntity entity = new ExternalAccessLogEntity();
		final String businessId = UUID.randomUUID().toString().replace("-", "");
		// 存储业务ID
		request.setAttribute(BUSINESS_ID_KEY, businessId);
		entity.setBusinessId(businessId);
		entity.setAccessCode(accessCode);
		/*
		 * GET/DELETE方式: 记录url参数
		 * POST/PUT方式: 记录请求消息体
		 */
		String param = null;
		if ("get".equals(method) || "delete".equals(method))
		{
			log.info("queryParam: " + request.getQueryString());
			param = request.getQueryString();
		} else if ("put".equals(method) || "post".equals(method))
		{ //
			param = streamToString(request.getInputStream());
		} else
		{
			log.warn("未处理请求方式: " + method);
		}
		// 设置请求参数
		if (null != param)
		{
			entity.setRequestParam(param.trim());
		}
		// 设置请求地址
		entity.setRequestAddr(getIpAddr(request));
		// 存储开始时间
		request.setAttribute(BEGIN_TIME_KEY, new Date().getTime());
		externalAccessLogMapper.insert(entity);
		
		return true;
	}

	/**
	 * @description 处理完成之后，客户端收到消息之前
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 * @author qianye.zheng
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		/*
		 * 取出处理时间，计算出持续时间
		 */
		final String businessId = request.getAttribute(BUSINESS_ID_KEY).toString();
		final Long beginTime = Long.valueOf(request.getAttribute(BEGIN_TIME_KEY).toString());
		ExternalAccessLogEntity entity = new ExternalAccessLogEntity();
		entity.setBusinessId(businessId);
		final Long endureSecond = ((new Date()).getTime()- beginTime) / 1000;
		entity.setEndureSecond(endureSecond.intValue());
		final Object result = request.getAttribute(RETURN_OBJECT_LEU);
		if (null != result)
		{
			entity.setResponseResult(GsonUtil.toJson(result));
		}
		//entity.setRemark("备注哈哈");
		externalAccessLogMapper.update(entity);
	}

	/**
	 * @description 完成整个处理，客户端收到消息之后
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 * @author qianye.zheng
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		log.warn("完成整个处理，客户端收到消息之后");
	}
	
	/**
	 * 
	 * 描述: 将流转换成字符串
	 * @author qye.zheng
	 * 
	 * @param input
	 * @return
	 */
	public static String streamToString(final InputStream input) 
	{      
		final StringBuilder builder = StringUtil.getBuilder();     
        String line = null;      
        try 
        {      
        	final BufferedReader reader = new BufferedReader(new InputStreamReader(input, Constant.CHART_SET_UTF_8));      
            while (null != (line = reader.readLine())) {  
                builder.append(line + "\n");      
            }    
            input.close();
        } catch (IOException e) 
        {      
            e.printStackTrace();      
        } 
        
        return builder.toString();      
    }  
	
	/**
	 * 获取请求的ip地址
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {  
		String ipAddress = null;  
		ipAddress = request.getHeader("x-forwarded-for");  
		if (ipAddress == null || ipAddress.length() == 0  
		        || "unknown".equalsIgnoreCase(ipAddress)) {  
		    ipAddress = request.getHeader("Proxy-Client-IP");  
		}  
		if (ipAddress == null || ipAddress.length() == 0  
		        || "unknown".equalsIgnoreCase(ipAddress)) {  
		    ipAddress = request.getHeader("WL-Proxy-Client-IP");  
		}  
		if (ipAddress == null || ipAddress.length() == 0  
		        || "unknown".equalsIgnoreCase(ipAddress)) {  
		    ipAddress = request.getRemoteAddr();  
		          
		    //这里主要是获取本机的ip,可有可无  
		    if (ipAddress.equals("127.0.0.1")  
		            || ipAddress.endsWith("0:0:0:0:0:0:1")) {  
		        // 根据网卡取本机配置的IP  
		        InetAddress inet = null;  
		        try {  
		            inet = InetAddress.getLocalHost();  
		        } catch (UnknownHostException e) {  
		            e.printStackTrace();  
		        }  
		        ipAddress = inet.getHostAddress();  
		    }  
		  
		}  
		  
		// 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
		if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()  
		                                                    // = 15  
		    if (ipAddress.indexOf(",") > 0) {  
		        ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));  
		    }  
		}  
		 //或者这样也行,对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割    
		//return ipAddress!=null&&!"".equals(ipAddress)?ipAddress.split(",")[0]:null;         
		return ipAddress;  
	} 

}
