package com.cocmaster.firstBlood_base_common.exception;


/**
 * @author di
 * 所有的service异常
 * */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	protected String errorCode;

	protected String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ServiceException(IExceptionCode code) {
		super(ExceptionHelper.getMessage(code));
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = this.getMessage();
	}

	public ServiceException(IExceptionCode code, String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = ExceptionHelper.getMessage(code);
	}

	public ServiceException(IExceptionCode code, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = ExceptionHelper.getMessage(code);
	}

	public ServiceException(IExceptionCode code, String message) {
		super(message);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = ExceptionHelper.getMessage(code);
	}

	public ServiceException(IExceptionCode code, Throwable cause) {
		super(ExceptionHelper.getMessage(code), cause);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = this.getMessage();
	}

}
