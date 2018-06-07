package com.gao.jin.service;

import com.gao.jin.dto.User;
import com.gao.jin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int regist(User user) {
        return userMapper.regist(user);
    }
}
