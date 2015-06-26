package com.cocmaster.firstBlood_register_impl.serviceimpl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocmaster.firstBlood_base_common.exception.ServiceException;
import com.cocmaster.firstBlood_base_common.model.Do.User;
import com.cocmaster.firstBlood_base_common.model.Dto.UserRegisterCheck;
import com.cocmaster.firstBlood_register.service.IRegisterService;
import com.cocmaster.firstBlood_register_impl.dao.UserMapper;
import com.cocmaster.fristerBlood.util.PhoneFormactCheck.PhoneFormatCheck;

/**
 * @author wx
 * 
 * */
@Service
public class RegisterServiceImpl implements IRegisterService{

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PhoneFormatCheck phoneCheck;
	private String phone;
	
	public int sendPhoneCheckKey() {
		
		return 0;
	}
	
	public int userResgister(UserRegisterCheck userCheck) {
		User user = new User();
		phone = userCheck.getPhone();
		
		//判断用户注册电话格式是否正确
		if(!phoneCheck.PhoneFormat(phone)){}
			//throw new ServiceException();
		
		//判断该号码是否已经被注册过
		int count = userMapper.checkUserExist(phone);
		if(count != 0)
			//TODO
		BeanUtils.copyProperties(userCheck, user);
		user.setCreateTime(new Timestamp(System.currentTimeMillis()));
		user.setUpdateTime(new Timestamp(System.currentTimeMillis()));
		int result = userMapper.registerInsert(user);
		return result;
	}

}
