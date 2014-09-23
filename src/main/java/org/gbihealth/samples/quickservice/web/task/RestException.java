/*******************************************************************************
 * Copyright (c) 2005, 2014 xiaoyao.framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.gbihealth.samples.quickservice.web.task;

import org.springframework.http.HttpStatus;

/**
 * 专用于Restful Service的异常.
 * 
 * @author jason
 */
public class RestException extends RuntimeException {

	public HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

	public RestException() {
	}

	public RestException(HttpStatus status) {
		this.status = status;
	}

	public RestException(String message) {
		super(message);
	}

	public RestException(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}
}
