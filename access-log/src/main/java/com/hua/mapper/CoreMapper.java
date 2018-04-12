/**
  * @filename CoreMapper.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.mapper;

 /**
 * @type CoreMapper
 * @description 
 * @author qianye.zheng
 */
public abstract interface CoreMapper<E>
{
	
	/**
	 * 描述: 插入单个对象
	 * @author qye.zheng
	 * @param e
	 */
	public int insert(final E e);
	
	/**
	 * 
	 * 描述: 更新单个对象(全量)
	 * 
	 * @author qye.zheng
	 * @param e
	 */
	public int update(final E e);
	
}
