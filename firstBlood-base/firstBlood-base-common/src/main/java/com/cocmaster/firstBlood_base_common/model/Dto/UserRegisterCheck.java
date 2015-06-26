package com.cocmaster.firstBlood_base_common.model.Dto;

/**
 *  用户注册(phone chackMsg passwd)验证
 *  @author wx
 */
public class UserRegisterCheck {
	private String phone;
	private String passwd;
	private long checkMsg;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public long getCheckMsg() {
		return checkMsg;
	}
	public void setCheckMsg(long checkMsg) {
		this.checkMsg = checkMsg;
	}
	@Override
	public String toString() {
		return "UserRegisterCheck [phone=" + phone + ", passwd=" + passwd
				+ ", checkMsg=" + checkMsg + "]";
	}
	
}
