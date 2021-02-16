/**
* LogUtil.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.util;

/**
 * 描述: 
 * @author qye.zheng
 * LogUtil
 */
public final class LogUtil {
	
	/** 禁止实例化 */
	private LogUtil() {
	}
	
	/**
	 * 
	 * 描述: 使用默认环境，快速初始化log4j
	 * 
	 * @author qye.zheng
	 */
	public static void log4jInitByDefault() {
		// 使用默认环境
		//BasicConfigurator.configure();
	}
	
	/**
	 * 
	 * 描述: 使用properties配置文件，初始化log4j
	 * 
	 * @author qye.zheng
	 * @param filePath
	 */
	public static void log4jInitByProperties(final String filePath) {
		// java项目(非web项目) 获取 bin 类路径
		final String path = LogUtil.class.getResource(filePath).getPath();
		// 使用properties配置文件
		//PropertyConfigurator.configure(path);
	}
	
	/**
	 * 
	 * 描述: 使用xml 配置文件，初始化log4j
	 * 
	 * @author qye.zheng
	 * @param configFilename
	 */
	public static void log4jInitByXml(final String filePath) {
		// java项目(非web项目) 获取 bin 类路径
		final String path = LogUtil.class.getResource(filePath).getPath();
		// 使用xml 配置文件
		//DOMConfigurator.configure(path);
	}
	
}
