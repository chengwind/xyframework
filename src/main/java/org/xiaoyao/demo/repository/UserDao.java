/*******************************************************************************
 * Copyright (c) 2005, 2014 xiaoyao.framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package org.xiaoyao.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.xiaoyao.demo.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
