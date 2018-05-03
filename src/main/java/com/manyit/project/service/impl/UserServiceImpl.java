package com.manyit.project.service.impl;

import com.manyit.project.dao.UserMapper;
import com.manyit.project.model.User;
import com.manyit.project.service.UserService;
import com.manyit.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/03.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
