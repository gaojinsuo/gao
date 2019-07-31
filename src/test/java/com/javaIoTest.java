package com;

import com.gao.jin.web.FileUtils;
import com.gao.jin.dto.User;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaIoTest {
    public static void main(String[] args) {
//        File file = new File("/Users/gaojinsuo/gao.csv");
//        String path = file.getPath();
//        boolean flag = true;
//        try {
//            if (file.exists()){
//                flag = file.delete();
//            }
//            if (flag) {
//                flag = file.createNewFile();
//            }else {
//                System.out.println("delete fail");
//            }
//            if (!flag){
//                System.out.println("create fail");
//            }
//        }catch (Exception e){
//            return;
//        }
//        String exportTitle = "学号；名字；年龄";
         try {
            test();
         }catch (Exception e){

         }

    }


    public static void test() throws IOException, IllegalArgumentException, IllegalAccessException{
        String[] title = new String[]{"ID","姓名"};
        String[] property = new String[]{"id","name"};
        List<String> propertys = Arrays.asList(property);
        List<String> titles = Arrays.asList(title);
        HttpServletResponse response = new MockHttpServletResponse();
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

    @Test
    public void test1(){
        String a = "ABCD";
        String b = "DCBA";
        if (a.compareTo(b)<0){
            System.out.println(true);
        }
    }

    @Test
    public void test12(){
        AopTest aopTest = new AopTest();
        BaseTest baseTest = new BaseTest();
        aopTest.a();
        baseTest.a();
        baseTest.a(1);
    }


}
