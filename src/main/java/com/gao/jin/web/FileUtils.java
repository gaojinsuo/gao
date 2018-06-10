package com.gao.jin.web;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;

public class FileUtils {
    public static <T> void exportCsv(HttpServletResponse response, File file, List<T> data, List<String> titles, List<String> propertys) throws IOException, IllegalAccessException {
        //防止乱码，把字节流转化成字符流，一个汉字占用两个字节，一个字符
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        for (String title : titles) {
            osw.write(title);
            osw.write(",");
        }
        osw.write("\r\n");
        for (Object object : data) {
            for (String property : propertys) {
                Field[] fields = object.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (property.equals(field.getName())) {
                        osw.write(field.get(object).toString());
                        osw.write(",");
                    }
                }
            }
            osw.write("\r\n");
        }

        osw.flush();
        osw.close();
        response.reset();
        response.setHeader("Content-Disposition", "attachment;filename="+ new String((file.getName().getBytes())));
        response.setHeader("Connection", "close");
        response.setHeader("Content-Type", "application/octet-stream");

        OutputStream ops = null;
        FileInputStream fis =null;
        byte[] buffer = new byte[8192];
        int bytesRead = 0;

        try {
            ops = response.getOutputStream();
            fis = new FileInputStream(file.getPath());
            while((bytesRead = fis.read(buffer, 0, 8192)) != -1){
                ops.write(buffer, 0, bytesRead);
            }
            ops.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null){
                    fis.close();
                }
                if(ops != null){
                    ops.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
