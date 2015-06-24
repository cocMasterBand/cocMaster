package com.cocmaster.firstBlood_base_common.constant;

/**
 * @author di
 * 返回dto类的常量
 * 需要直接在里面添加*/
public class ReturnKey {
	//访问成功
	//访问成功
	public static final int RETURN_STATUS_SUCCESS = 20000;
	
	//接口访问相关
	//需要登陆才能访问
	public static final int RETURN_STATUS_NEED_LOGIN = 30001;
	
	//注册相关
	//手机号验证码不正确
	public static final int RETURN_STATUS_PHONECHECK_ERROR = 40001;
	//手机号格式不正确
	public static final int RETURN_STATUS_PHONE_FORMAT_ERROR = 40002;
}
