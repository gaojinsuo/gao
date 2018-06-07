package com.gao.jin.dto;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private Date creatTime;
}
