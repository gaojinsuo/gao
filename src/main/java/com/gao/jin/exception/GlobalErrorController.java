package com.gao.jin.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class GlobalErrorController extends BasicErrorController {
    @Autowired
    public GlobalErrorController(ErrorAttributes errorAttributes) {
        this(errorAttributes, new ErrorProperties(), Collections.emptyList());
    }

    public GlobalErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorProperties, errorViewResolvers);

    }

    @RequestMapping("/error")
    public Map<String,String> eError(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        map.put("code",this.getStatus(request).toString());
        return map;
    }

}
