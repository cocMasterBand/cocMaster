package com.cocmaster.firstBlood_register_impl;

import org.springframework.stereotype.Service;

import com.cocmaster.firstBlood_register.ISayHiService;


/**
 * @author di
 * for test
 * say hi, who u a 
 * 
 * */
@Service
public class SayHiServiceImpl implements ISayHiService{

	public String sayHi(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("hi there, here si cocMaster.\n");
		sb.append(String.format("just having fun %s!", name));
		return sb.toString();
	}
	
}
