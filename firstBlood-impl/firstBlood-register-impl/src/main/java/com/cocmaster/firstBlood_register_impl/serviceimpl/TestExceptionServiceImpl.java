package com.cocmaster.firstBlood_register_impl.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cocmaster.firstBlood_base_common.exception.FirstbloodExceptionCode;
import com.cocmaster.firstBlood_base_common.exception.ServiceException;
import com.cocmaster.firstBlood_register.service.ITestExceptionService;

@Service
public class TestExceptionServiceImpl implements ITestExceptionService {
	private final static Logger logger = LoggerFactory.getLogger(TestExceptionServiceImpl.class);

	// Exception管理demo
	public void testException() throws ServiceException {
		logger.info("test excption");
		throw new ServiceException(FirstbloodExceptionCode.FIRSTBLOOD_EXCEPTION_JUST_FOR_TEST);
	}

}
