package com.gao.jin.service;

import com.gao.jin.web.FileUtils;
import com.gao.jin.dto.User;
import com.gao.jin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int regist(User user) {
        return userMapper.regist(user);
    }

    @Override
    public void exportCsv(HttpServletResponse response) throws IOException, IllegalAccessException {
        String[] title = new String[]{"ID","姓名"};
        String[] property = new String[]{"id","name"};
        List<String> propertys = Arrays.asList(property);
        List<String> titles = Arrays.asList(title);
        List<User> list = new ArrayList<User>();
        User user;
        user = new User();
        user.setId(1);
        user.setName("张三");
        list.add(user);
        user = new User();
        user.setId(2);
        user.setName("李四");
        list.add(user);
        File file = new File("/Users/gaojinsuo/jinsuo.csv");
        FileUtils.exportCsv(response,file,list,titles,propertys);
    }
}
