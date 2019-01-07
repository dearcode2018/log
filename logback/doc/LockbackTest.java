/**
 * 描述: 
 * LockbackTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.logback;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;



/**
 * 描述: 
 * 
 * @author qye.zheng
 * LockbackTest
 */
public final class LockbackTest {
	
	
	/**
	 * logback是slf4j-api的一个实现
	 * 在一个环境中应该去掉slf4j-api的其他实现，logback才能起作用.
	 */
	//public static final Logger logger = LoggerFactory.getLogger(LockbackTest.class);
	
		/**
		 * 
		 * 描述: 
		 * @author qye.zheng
		 * 
		 */
		@Test
		public void testLockback() {
			try {
				logger.debug("16:48:21,088 |-INFO in ch.qos.logback.classic.LoggerContext[logback_00_] - Found resource [logback-test.xml] at [file:/E:/workspace/java/log-entire/logback/target/classes/logback-test.xml]\r\n" + 
						"16:48:21,168 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set\r\n" + 
						"16:48:21,173 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - Will scan for changes in [file:/E:/workspace/java/log-entire/logback/target/classes/logback-test.xml] \r\n" + 
						"16:48:21,173 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - Setting ReconfigureOnChangeTask scanning period to 1 minutes\r\n" + 
						"16:48:21,177 |-ERROR in ch.qos.logback.core.joran.action.PropertyAction - In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.\r\n" + 
						"16:48:21,178 |-INFO in ch.qos.logback.core.joran.action.TimestampAction - Using current interpretation time, i.e. now, as time reference.\r\n" + 
						"16:48:21,190 |-INFO in ch.qos.logback.core.joran.action.TimestampAction - Adding property to the context with key=\"df_yyyy_MM_dd\" and value=\"2018-11-28\" to the LOCAL scope\r\n" + 
						"16:48:21,191 |-INFO in ch.qos.logback.core.joran.action.TimestampAction - Using current interpretation time, i.e. now, as time reference.\r\n" + 
						"16:48:21,191 |-INFO in ch.qos.logback.core.joran.action.TimestampAction - Adding property to the context with key=\"df_yyyyMMdd\" and value=\"20181128T164821\" to the LOCAL scope\r\n" + 
						"16:48:21,191 |-INFO in ch.qos.logback.classic.joran.action.ContextNameAction - Setting logger context name as [logback_00_]\r\n" + 
						"16:48:21,191 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]\r\n" + 
						"16:48:21,197 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [stdOut]\r\n" + 
						"16:48:21,207 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property\r\n" + 
						"16:48:21,236 |-ERROR in ch.qos.logback.classic.PatternLayout(\"null\") - Empty or null pattern.\r\n" + 
						"16:48:21,239 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]\r\n" + 
						"16:48:21,273 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [file]\r\n" + 
						"16:48:21,274 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property\r\n" + 
						"16:48:21,274 |-ERROR in ch.qos.logback.classic.PatternLayout(\"null\") - Empty or null pattern.\r\n" + 
						"16:48:21,274 |-INFO in ch.qos.logback.core.FileAppender[file] - File property is set to [/data/log/logback_1.txt]\r\n" + 
						"16:48:21,278 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.rolling.RollingFileAppender]\r\n" + 
						"16:48:21,279 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [fileLog]\r\n" + 
						"16:48:21,281 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property\r\n" + 
						"16:48:21,297 |-INFO in c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@1750286943 - Archive files will be limited to [10 KB] each.\r\n" + 
						"16:48:21,300 |-INFO in c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@1750286943 - Will use zip compression\r\n" + 
						"16:48:21,302 |-INFO in c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@1750286943 - Will use the pattern LOGPATH_IS_UNDEFINED/%d{yyyy-MM-dd}/%d{yyyy-MM-dd}.%i.log for the active file\r\n" + 
						"16:48:21,305 |-INFO in ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP@352c1b98 - The date pattern is 'yyyy-MM-dd' from file name pattern 'LOGPATH_IS_UNDEFINED/%d{yyyy-MM-dd}/%d{yyyy-MM-dd}.%i.log.zip'.\r\n" + 
						"16:48:21,305 |-INFO in ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP@352c1b98 - Roll-over at midnight.\r\n" + 
						"16:48:21,308 |-INFO in ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP@352c1b98 - Setting initial period to Wed Nov 28 16:47:49 CST 2018\r\n" + 
						"16:48:21,313 |-INFO in ch.qos.logback.core.rolling.RollingFileAppender[fileLog] - Active log file name: /data/log/logback_1.txt\r\n" + 
						"16:48:21,313 |-INFO in ch.qos.logback.core.rolling.RollingFileAppender[fileLog] - File property is set to [/data/log/logback_1.txt]\r\n" + 
						"16:48:21,313 |-ERROR in ch.qos.logback.core.rolling.RollingFileAppender[fileLog] - 'File' option has the same value \"/data/log/logback_1.txt\" as that given for appender [file] defined earlier.\r\n" + 
						"16:48:21,313 |-ERROR in ch.qos.logback.core.rolling.RollingFileAppender[fileLog] - Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.\r\n" + 
						"16:48:21,313 |-ERROR in ch.qos.logback.core.rolling.RollingFileAppender[fileLog] - For more information, please visit http://logback.qos.ch/codes.html#earlier_fa_collision\r\n" + 
						"16:48:21,313 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG\r\n" + 
						"16:48:21,313 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [stdOut] to Logger[ROOT]\r\n" + 
						"16:48:21,314 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [com.hua] to INFO\r\n" + 
						"16:48:21,315 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [stdOut] to Logger[com.hua]\r\n" + 
						"16:48:21,315 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.\r\n" + 
						"16:48:21,316 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@21129f1f - Registering current configuration as safe fallback point");
				
			} catch (Exception e) {
				logger.error("testLockback =====> ", e);
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
			logger.warn("dddd");
			
		} catch (Exception e) {
			logger.error("test =====> ", e);
		}
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
			logger.error("testTemp=====> ", e);
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
			logger.error("testCommon =====> ", e);
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
			logger.error("testSimple =====> ", e);
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
			logger.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
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
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		//assertNull(message, actuals);
		//assertNotNull(message, actuals);
		
		//assertThat(null, null);
		//assertThat(null, null, null);
		
		//fail();
		//fail("Not yet implemented");
		
	}

}
