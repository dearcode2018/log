/**
* BaseLog.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.log.apache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * 描述: apache commons logging for java
 * @author qye.zheng
 * BaseLog
 */
public class ApacheBaseLog {
	
	/* 属性文件的位置 */
	public static final String propertiesPath = "/conf/apache/apache-log4j.properties";
	
	/* xml文件的位置 */
	public static final String xmlPath = "/conf/apache/";
	
	/* apache commons log */
	public final Logger log = LogManager.getLogger(this.getClass().getName());
	
	
}
