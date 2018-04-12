/**
* Slf4jTest.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.test.log;

import org.junit.Test;
import org.slf4j.Logger;

import com.hua.log.slf4j.SlfBaseLog;
import com.hua.log.slf4j.SlfLog;
import com.hua.test.BaseTest;
import com.hua.util.LogUtil;

/**
 * 描述: 
 * @author qye.zheng
 * Slf4jTest
 */
public class Slf4jTest extends BaseTest {
	
	public static SlfLog slfLog = new SlfLog();
	
	/* slf4j logger */
	public static Logger log = slfLog.log;
	
	static {
		// 使用指定的配置启动 log
		LogUtil.log4jInitByProperties(SlfBaseLog.propertiesPath);
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
