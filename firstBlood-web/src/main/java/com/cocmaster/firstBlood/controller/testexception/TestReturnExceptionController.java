package com.cocmaster.firstBlood.controller.testexception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cocmaster.firstBlood_base_common.exception.ServiceException;
import com.cocmaster.firstBlood_register_impl.serviceimpl.TestExceptionServiceImpl;

/**
 * @author di
 * exception 管理demo
 * */
@Controller
@RequestMapping(value="/test_return_exception")
public class TestReturnExceptionController {
	@Autowired
	TestExceptionServiceImpl testExceptionServiceImpl;
	
	@RequestMapping(value="/test")
	public void TestException() throws ServiceException{
		testExceptionServiceImpl.testException();
	}
}
