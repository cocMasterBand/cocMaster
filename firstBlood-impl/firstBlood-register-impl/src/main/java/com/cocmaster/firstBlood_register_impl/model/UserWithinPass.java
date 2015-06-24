package com.cocmaster.firstBlood_register_impl.model;


/**
 * @author di
 * 是do, 和前端传来的值直接1对1匹配
 * 这里面有password
 * 除了注册 避免使用这个类 避免暴露用户密码 
 * 想了想 还是前端直接加盐然后md5后将字符串扔过来把 安全些
 * TODO 每个用户独立盐比较麻烦 统一一个盐好了 如果项目值得黑客跑彩虹表 再改动态盐(感觉没这个可能)
 * 盐放到常量类
 * */
public class UserWithinPass {
	//微信的openid
	private String openId;
	
	//用户注册 使用手机号注册 暂时不验证 
	private int phone;
	
	//用来给手机验证留的变量 目前可以不用
	private String phoneIdentifyCode;
	
	//加盐哈希后的密码
	private String password;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPhoneIdentifyCode() {
		return phoneIdentifyCode;
	}

	public void setPhoneIdentifyCode(String phoneIdentifyCode) {
		this.phoneIdentifyCode = phoneIdentifyCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserWithinPass [openId=" + openId + ", phone=" + phone
				+ ", phoneIdentifyCode=" + phoneIdentifyCode + ", password="
				+ password + "]";
	}

	
	
}
