package com.gao.jin;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.util.List;

public class FileUtils {
    public static <T> void exportCsv(HttpServletResponse response, File file, List<T> data, List<String> titles, List<String> propertys) throws IOException, IllegalAccessException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), "GB2312");
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
    }
}
