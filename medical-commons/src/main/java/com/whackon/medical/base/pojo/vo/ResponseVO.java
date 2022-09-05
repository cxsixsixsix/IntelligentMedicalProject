package com.whackon.medical.base.pojo.vo;

import com.whackon.medical.base.pojo.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * <b>系统响应视图信息</b>
 * <p>
 *     本项目所有和前端交互返回数据都必须以本响应试图信息对象返回。
 * </p>
 * @author Qt
 * @date 2022/8/24
 */
@Data
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = 1466395221278356911L;
	private Integer code;                         // 响应编码
	private String message;                       // 响应信息
	private E data;                               // 响应数据

	public ResponseVO(ResponseEnum responseEnum, String message, E data){
		this.code = responseEnum.getCode();
		this.message = message;
		this.data = data;
	}

	/**
	 * <b>获得系统业务处理和响应成功视图信息</b>
	 * @param message
	 * @return
	 */
	public static ResponseVO ceateSuccessResponseVO(String message){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS,message,new String(""));
	}
	/**
	 * <b>获得系统业务处理和响应成功视图信息</b>
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO ceateSuccessResponseVO(String message, Object data){
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS,message,data);
	}
	/**
	 * <b>获得用户未进行系统认证视图信息</b>
	 * @return
	 */
	public static ResponseVO createUnAuthResponseVO(){
		return new ResponseVO(ResponseEnum.RESPONSE_UNAUTH,ResponseEnum.RESPONSE_UNAUTH.getRemark(),new String(""));
	}
	/**
	 * <b>获得系统业务处理错误视图信息</b>
	 * @param errorMessage
	 * @return
	 */
	public static ResponseVO createFailureResponseVO(String errorMessage){
		return new ResponseVO(ResponseEnum.RESPONSE_FAILURE,errorMessage,new String(""));
	}
	/**
	 * <b>获得系统响应异常视图信息</b>
	 * @param exception
	 * @return
	 */
	public static ResponseVO createExceptionResponseVO(Exception exception){
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION,exception.getMessage(),exception);
	}
}
