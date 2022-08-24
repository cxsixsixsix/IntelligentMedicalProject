package com.whackon.medical.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * <b>基础常量信息</b>
 * @author Administrator
 * @date 2022/8/24
 */
public class BaseConstants {
	//当系统运行过程中产生的所有一场信息，除了直接抛出之外，还需要纪律到日志中
	//创建日志对象
	private static Logger longger = LoggerFactory.getLogger(BaseConstants.class);
	private static Properties props = new Properties();
	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (IOException e) {
			//将产生的异常信息记录到日志中
			longger.error(e.getMessage() + ":" + new Date(),e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * <b>系统分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("base.page.num"));

	/**
	 * <b>系统分页信息：默认每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("base.page.size"));
}
