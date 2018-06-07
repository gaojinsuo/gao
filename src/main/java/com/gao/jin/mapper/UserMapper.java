package com.gao.jin.mapper;

import com.gao.jin.dto.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,password) values (#{name},#{password})")
    int regist(User user);
}
