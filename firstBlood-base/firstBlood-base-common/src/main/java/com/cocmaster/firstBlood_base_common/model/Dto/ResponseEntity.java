package com.cocmaster.firstBlood_base_common.model.Dto;

/**
 * @author di
 * 这个类是返回对象的实体类
 * 和前端交互 都包装成这个类别去返回
 * */
public class ResponseEntity {
	//详细设定见returnKey中的常量设定
	private int status;
	private String msg;
	private Object data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseEntity [status=" + status + ", msg=" + msg + ", data="
				+ data + "]";
	}
	
	
}
