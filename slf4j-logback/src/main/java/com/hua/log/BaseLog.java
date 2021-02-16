/**
* BaseLog.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述: 
 * @author qye.zheng
 * BaseLog
 */
public class BaseLog {
	
	protected final Logger log = LoggerFactory.getLogger(getClass().getName());
	
}
