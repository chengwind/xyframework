/*******************************************************************************
 * Copyright (c) 2005, 2014 xiaoyao.framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.gbihealth.samples.quickservice.web.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api")
public class ApiListController {
	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		return "api/list";
	}
}
