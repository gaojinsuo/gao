package com.gao.jin.crawl;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawderDemo {
    public static void main(String[] args)  {
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod("https://www.baidu.com/");
        try {
            int status = httpClient.executeMethod(getMethod);
            byte[] responsebody = getMethod.getResponseBody();
            String content = new String(responsebody,"UTF-8");
            Document document = Jsoup.parse(content);
            Elements elements = document.select("div.clearfix a");
            System.out.println(elements.text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
