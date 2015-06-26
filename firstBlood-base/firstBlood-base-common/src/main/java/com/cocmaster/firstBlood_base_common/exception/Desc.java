package com.cocmaster.firstBlood_base_common.exception;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author di
 * 用来描述的注释 
 * 直接使用@Desc("xxx")使用
 * 
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Desc {
	public String value() default "";
}

