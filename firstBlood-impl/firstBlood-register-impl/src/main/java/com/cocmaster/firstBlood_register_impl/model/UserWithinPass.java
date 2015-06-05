package com.cocmaster.firstBlood_register_impl.model;


/**
 * @author di
 * 是dto, 和前端传来的值直接1对1匹配
 * 这里面有password
 * 除了注册 避免使用这个类 避免暴露用户密码 
 * */
public class UserWithinPass {
	//微信的openid
	private String openId;
	
	//用户注册 使用手机号注册 暂时不验证 
	private int phone;
	
}
