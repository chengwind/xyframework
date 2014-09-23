/*******************************************************************************
 * Copyright (c) 2005, 2014 xiaoyao.framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.gbihealth.samples.quickservice.repository;

import org.gbihealth.samples.quickservice.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
