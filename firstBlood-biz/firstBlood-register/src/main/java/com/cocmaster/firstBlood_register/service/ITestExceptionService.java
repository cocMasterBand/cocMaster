package com.cocmaster.firstBlood_register.service;

import org.springframework.stereotype.Service;

import com.cocmaster.firstBlood_base_common.exception.ServiceException;

/**
 * @author di
 * 一个exception管理的demo
 * 
 * */
@Service
public interface ITestExceptionService {
	public void testException() throws ServiceException;
}
