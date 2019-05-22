/**
  * @filename ElasticSearchAppender.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.appender;

import java.io.Serializable;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

/**
 * @type ElasticSearchAppender
 * @description 
 * @author qianye.zheng
 */
@Plugin(name = "EsAppender", category = "Core", elementType = "appender", printObject = true)
public class ElasticSearchAppender extends AbstractAppender
{

	/**
	 * @description 构造方法
	 * @param name
	 * @param filter
	 * @param layout
	 * @author qianye.zheng
	 */
	protected ElasticSearchAppender(final String name, final Filter filter, final Layout<? extends Serializable> layout,
            final boolean ignoreExceptions, final Property[] properties)
	{
		super(name, filter, layout, ignoreExceptions, properties);
	}

	/**
	 * @description 
	 * @param event
	 * @author qianye.zheng
	 */
	@Override
	public void append(LogEvent event)
	{
		
		
	}

	/**
	 * 
	 * @description 
	 * @param filter
	 * @param layout
	 * @param name
	 * @param localCacheDir
	 * @param servers
	 * @return
	 * @author qianye.zheng
	 */
	@PluginFactory
	public static final ElasticSearchAppender createAppender(final @PluginElement("filter") Filter filter, 
			final @PluginElement("layout") Layout<? extends Serializable> layout, final @PluginElement("name") String name, 
			final @PluginElement("localCacheDir") String localCacheDir, final @PluginElement("servers") String servers)
	{
		final ElasticSearchAppender appender = new ElasticSearchAppender(name, filter, layout, false, null);
		
		return appender;
	}
	
}
