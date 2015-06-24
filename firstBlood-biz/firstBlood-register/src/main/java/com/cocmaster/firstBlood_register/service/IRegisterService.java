package com.cocmaster.firstBlood_register.service;

/**
 * @author di
 * 注册服务
 * */
public interface IRegisterService {
	/**
	 * 发送验证码给用户
	 * 然后将用户手机号和
	 * */
	public int sendPhoneCheckKey();
	
	/**
	 * 用户注册
	 * @return int 用户id
	 * */
	public int userResgister();
}
