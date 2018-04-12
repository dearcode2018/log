/**
* ApacheLogTest.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.test.log;

import org.apache.commons.logging.Log;
import org.junit.Test;

import com.hua.log.apache.ApacheBaseLog;
import com.hua.log.apache.ApacheLog;
import com.hua.test.BaseTest;
import com.hua.util.LogUtil;

/**
 * 描述: 
 * @author qye.zheng
 * ApacheLogTest
 */
public class ApacheLogTest extends BaseTest {
	
	public static ApacheLog apacheLog = new ApacheLog();
	
	/* apache commons log */
	public static Log log = apacheLog.log;
	
	static {
		// 使用指定的配置启动 log
		LogUtil.log4jInitByProperties(ApacheBaseLog.propertiesPath);
		//LogUtil.log4jInitByDefault();
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
}
