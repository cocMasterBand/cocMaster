package com.cocmaster.fristerBlood.util.PhoneFormactCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

/**
 * 用户手机注册格式验证
 * */
@Component
public class PhoneFormatCheck {
	
	public Boolean PhoneFormat(String phoneNuber){
		Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
 		Matcher matcher = pattern.matcher(phoneNuber);
		return matcher.matches();
	}
}
