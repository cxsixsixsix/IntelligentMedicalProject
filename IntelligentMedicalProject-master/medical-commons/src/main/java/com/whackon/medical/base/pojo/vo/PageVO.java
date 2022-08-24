package com.whackon.medical.base.pojo.vo;

import com.whackon.medical.base.util.BaseConstants;

import java.io.Serializable;
import java.util.List;

/**
 * <b></b>
 *
 * @author Qt
 * @date 2022/8/24
 */
@Data
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -2439429337168551684L;
	private Integer pageNum;                    // 当前页码
	private Integer pageSize;                   // 每页显示数量
	private List<E> list;                       // 分页列表
	private Long totalCount;                    // 总条数
	private Integer totalPage;                  // 总页数

	public PageVO(){}

	public PageVO(Integer pageNum, Integer pageSize){
		//判断所给定的当前页码是否有效
		if (pageNum != null && pageNum > 0){
			//所给定的当前页码有效
			this.pageNum = pageNum;
		}else {
			//所给定的当前页码无效，则使用默认值
			this.pageNum = BaseConstants.PAGE_NUM;
		}

		if(pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		}else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}

}

