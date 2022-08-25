package com.whackon.medical.base.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础实体信息</b>
 *<p>
 *     基础实体信息设置了一下属性：
 *     1、status:系统状态<br/>
 *     2、createBy:创建人<br/>
 *     3、createTime:创建时间<br/>
 *     4、modifiedBy:修改人<br/>
 *     5、modifiedTime:修改时间<br/>
 *     本项目所有功能实体信息都必须继承于本基础实体信息
 *</p>
 * @author Administrator
 * @date 2022/8/25 0025
 */
@Data
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -7554047729387952285L;
	private String status;              //系统状体：0-禁用 1-启用
	@TableField("createBy")
	private String createBy;            //创建人
	@TableField("createTime")
	private Date createTime;             //创建时间
	@TableField("modifiedBy")
	private String modifiedBy;          //修改人
	@TableField("modifiedTime")
	private Date modifiedTime;          //修改时间
}
