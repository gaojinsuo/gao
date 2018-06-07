package com.gao.jin.annotation;


import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AopLog {
    String userName() default "";
    String message() default "";
}
