package com.cocmaster.firstBlood_base_common.model.Dto;

/**
 * @author di 这个类是返回对象的实体类 和前端交互 都包装成这个类别去返回
 * */
public class ResponseEntity<E> {
	// 详细设定见returnKey中的常量设定
	private int status;

	private E data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseEntity [status=" + status + ", data=" + data + "]";
	}
}
