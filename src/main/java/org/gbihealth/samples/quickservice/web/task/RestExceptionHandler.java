/*******************************************************************************
 * Copyright (c) 2005, 2014 xiaoyao.framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.gbihealth.samples.quickservice.web.task;

import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.xiaoyao.framework.core.beanvalidator.BeanValidators;
import org.xiaoyao.framework.mapper.JsonMapper;
import org.xiaoyao.framework.web.MediaTypes;

/**
 * 自定义ExceptionHandler，专门处理Restful异常.
 * 
 * @author jason
 */
// 会被Spring-MVC自动扫描，但又不属于Controller的annotation。
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	private JsonMapper jsonMapper = new JsonMapper();

	/**
	 * 处理RestException.
	 */
	@ExceptionHandler(value = { RestException.class })
	public final ResponseEntity<?> handleException(RestException ex, WebRequest request) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType(MediaTypes.TEXT_PLAIN_UTF_8));
		return handleExceptionInternal(ex, ex.getMessage(), headers, ex.status, request);
	}

	/**
	 * 处理JSR311 Validation异常.
	 */
	@ExceptionHandler(value = { ConstraintViolationException.class })
	public final ResponseEntity<?> handleException(ConstraintViolationException ex, WebRequest request) {
		Map<String, String> errors = BeanValidators.extractPropertyAndMessage(ex.getConstraintViolations());
		String body = jsonMapper.toJson(errors);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType(MediaTypes.TEXT_PLAIN_UTF_8));
		return handleExceptionInternal(ex, body, headers, HttpStatus.BAD_REQUEST, request);
	}
}
