package com.gao.jin.dataSouece;

import org.springframework.util.ClassUtils;

import java.util.regex.PatternSyntaxException;

public class MyJdbcDataSource extends MyDriveDataSource {

    public MyJdbcDataSource() {
    }

    MyJdbcDataSource(String url, String userName, String password){
        setUrl(url);
        setUserName(userName);
        setPassword(password);
    }

    public void setDriverClassName(String driver) throws ClassNotFoundException {
        Class.forName(driver,true,ClassUtils.getDefaultClassLoader());
    }

}
