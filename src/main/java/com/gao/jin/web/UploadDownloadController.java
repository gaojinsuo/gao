package com.gao.jin.web;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController("v1/uploadDownload")
public class UploadDownloadController {

    @RequestMapping("/uploadImage")
    public Boolean uploadImage(MultipartFile multipartFile) throws IOException {
        String path = "https://pan.baidu.com/disk/home?#/all?vmode=list&path=%2Fgjs";
        File file = new File(path + multipartFile.getOriginalFilename());
        multipartFile.transferTo(file);
        return true;
    }
}
