/**
* BaseLog.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 描述: 
 * @author qye.zheng
 * BaseLog
 */
public class BaseLog {
	
	/* apache commons log */
	protected final Log log = LogFactory.getLog(getClass().getName());

}
