package com.cocmaster.firstBlood_base_common.exception;

/**
 * @author di
 * 所有的系统异常放这里 
 * 估计不会有 先加上
 * */
public class SystemException extends RuntimeException {

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

	public SystemException(IExceptionCode code) {
		super(ExceptionHelper.getMessage(code));
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = this.getMessage();
	}

	public SystemException(IExceptionCode code, String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = ExceptionHelper.getMessage(code);
	}

	public SystemException(IExceptionCode code, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = ExceptionHelper.getMessage(code);
	}

	public SystemException(IExceptionCode code, String message) {
		super(message);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = ExceptionHelper.getMessage(code);
	}

	public SystemException(IExceptionCode code, Throwable cause) {
		super(ExceptionHelper.getMessage(code), cause);
		this.errorCode = ExceptionHelper.getCode(code);
		this.errorMessage = this.getMessage();
	}

}
