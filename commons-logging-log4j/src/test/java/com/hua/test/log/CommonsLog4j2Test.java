/**
 * 描述: 
 * CommonsLog4j2Test.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.log;

//静态导入
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hua.entity.User;
import com.hua.test.BaseTest;
import com.hua.util.JacksonUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * CommonsLog4j2Test
 */
//@DisplayName("测试类名称")
//@Tag("测试类标签")
//@Tags({@Tag("测试类标签1"), @Tag("测试类标签2")})
public final class CommonsLog4j2Test extends BaseTest {

	/* Commons Log 作为门面，底层为Log4j2的实现 */
	private Log log = LogFactory.getLog(getClass().getName());
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testCommonsLog4j2() {
		try {
			// org.apache.logging.log4j.jcl.Log4jLog
			System.out.println(log);
			
			Throwable t = new RuntimeException("构造异常");
			
			log.debug("debug info", t);
			
			/**
			 * 异常作为最后一个参数，不用书写 {} 占位符
			 */
			// 正确写法
			//log.debug("a = {}, b = {}, exception: ", "value1", 2, t);
			
			// 错误写法1
			//log.debug("a = {}, b = {}, exception: ", "value1", t, 2);
			
			// exception:{} 调用的是对象的toString()
			// 错误写法2
			//log.debug("a = {}, b = {}, exception: {}", "value1", 2, t);
			//System.out.println(t.toString());
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}	

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testDebug() {
		try {
			Throwable t = new RuntimeException("构造异常");
			/**
			 * 异常作为最后一个参数，不用书写 {} 占位符
			 */
			// 正确写法
			//log.debug("a = {}, b = {}, exception: ", "value1", 2, t);
			
			// 错误写法1
			//log.debug("a = {}, b = {}, exception: ", "value1", t, 2);
			
			// exception:{} 调用的是对象的toString()
			// 错误写法2
			//log.debug("a = {}, b = {}, exception: {}", "value1", 2, t);
			//System.out.println(t.toString());
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testLambda() {
		try {
			Throwable t = new RuntimeException("构造异常");
			/**
			 * 异常作为最后一个参数，不用书写 {} 占位符
			 */
			// 正确写法
			//log.debug("a = {}, b = {}, exception: ", "value1", 2, t);
			
			User user = new User();
			user.setLastLoginIp("2002:92a:8f7a:100:10::250");
			user.setLastLoginTime(LocalDateTime.now());
			log.warn("output:" + JacksonUtil.writeAsString(user));
			
			//log.warn(() -> "warn 级别才输出" + JacksonUtil.writeAsString(user));
			
			// 错误写法1
			//log.debug("a = {}, b = {}, exception: ", "value1", t, 2);
			
			// exception:{} 调用的是对象的toString()
			// 错误写法2
			//log.debug("a = {}, b = {}, exception: {}", "value1", 2, t);
			//System.out.println(t.toString());
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testBuilder() {
		try {
			Throwable t = new RuntimeException("构造异常");
			/**
			 * 异常作为最后一个参数，不用书写 {} 占位符
			 */
			// 正确写法
			//log.debug("a = {}, b = {}, exception: ", "value1", 2, t);
			
			User user = new User();
			user.setLastLoginIp("2002:92a:8f7a:100:10::250");
			user.setLastLoginTime(LocalDateTime.now());
			//log.warn("output:{}", JacksonUtil.writeAsString(user));
			
			//log.atInfo().log("builder info: {}", JacksonUtil.writeAsString(user));
			
			//log.warn(() -> "warn 级别才输出:" + JacksonUtil.writeAsString(user));
			
			// 错误写法1
			//log.debug("a = {}, b = {}, exception: ", "value1", t, 2);
			
			// exception:{} 调用的是对象的toString()
			// 错误写法2
			//log.debug("a = {}, b = {}, exception: {}", "value1", 2, t);
			//System.out.println(t.toString());
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testUseSpecialLogger() {
		try {
			Logger log = LogManager.getLogger("someLogger");
			log.info("some info");
			log.warn("some warn");
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testRollingRandomAccessFile() {
		try {
			int limit = 100;
			for (int i = 0; i < limit; i++) {
				Logger log = LogManager.getLogger("someLogger");
				//log.info("some info");
				log.warn("some warn");
				TimeUnit.MILLISECONDS.sleep(500);
			}
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@DisplayName("testTemp")
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
	@DisplayName("testCommon")
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
	@DisplayName("testSimple")
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
	@DisplayName("testBase")
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@DisplayName("beforeMethod")
	@Tag(" [每个测试-方法]结束之后运行")
	@BeforeEach
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@DisplayName("afterMethod")
	@Tag(" [每个测试-方法]结束之后运行")
	@AfterEach
	public void afterMethod() {
		System.out.println("afterMethod()");
	}
	
	/**
	 * 
	 * 描述: 测试忽略的方法
	 * @author qye.zheng
	 * 
	 */
	@Disabled
	@DisplayName("ignoreMethod")
	@Test
	public void ignoreMethod() {
		System.out.println("ignoreMethod()");
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@DisplayName("noUse")
	@Disabled("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(expecteds, actuals, message);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(true, message);
		assertTrue(true, message);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(expecteds, actuals, message);
		assertNotSame(expecteds, actuals, message);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(actuals, message);
		assertNotNull(actuals, message);
		
		fail();
		fail("Not yet implemented");
		
		dynamicTest(null, null);
		
		assumeFalse(false);
		assumeTrue(true);
		assumingThat(true, null);
	}

}
