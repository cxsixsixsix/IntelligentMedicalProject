package com.whackon.medical.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图类信息</b>
 * <p>
 *     基础实体新信息设置了如下属性<br/>
 *     1、status: 系统状态<br/>
 *     2、createBy: 创建人<br/>
 *     3、createTime: 创建时间<br/>
 *     4、modifiedBy: 修改人<br/>
 *     5、modifiedTime: 修改时间<br/>
 *     本项目所有功能实体信息都必须继承于本基础实体信息。
 * </p>
 *
 * @author Qt
 * @date 2022/8/24
 */
@Data
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 5372750180947646831L;
	private String status;                          //系统状态：0-禁用，1-启用
	private String createBy;                        //创建人
	private Date createTime;                        //创建时间
	private String modifiedBy;                      //修改人
	private Date modifiedTime;                      //修改时间
}
