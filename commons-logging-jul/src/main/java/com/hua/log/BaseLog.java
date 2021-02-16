/**
* BaseLog.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 描述: 
 * @author qye.zheng
 * BaseLog
 */
public class BaseLog {
	
	private static final String FILE_PATH = "/conf/properties/log4j.properties";
	
	/* apache commons log */
	protected final Logger log = LogManager.getLogger(this.getClass().getName());
	
	static {
		// 初始化 log4j 环境
		//PropertyConfigurator.configure(ClassPathUtil.getClassSubpath(FILE_PATH));
	}
}
