/**
* SlfBaseLog.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.log.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述: Simple Logging Facade for Java
 * @author qye.zheng
 * SlfBaseLog
 */
public class SlfBaseLog {
	
	/* 属性文件的位置 */
	public static final String propertiesPath = "/conf/slf/slf-log4j.properties";
	
	/* xml文件的位置 */
	public static final String xmlPath = "/conf/slf/";
	
	/* slf4j log  */
	public  Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
}
