package com.gao.jin.service;


import com.gao.jin.dto.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService {
    int regist(User user);

    void exportCsv(HttpServletResponse httpServletResponse) throws IOException, IllegalAccessException;
}
