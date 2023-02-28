package com.calb.es.utils;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonArray;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * @author pandeng.li
 */
public class CalendarUtil {

    /**
     * @param url   地址
     * @param param 参数
     * @param token url携带的headers（非必须）
     * @return java.lang.Object
     * @Description: get方式
     * @author wch001
     * @date 2022/5/6 9:50
     */
    public static Object requestGetUrl(String url, Map<String, String> param, String token) throws Exception {
        url="https://api.apihubs.cn/holiday/get";
        InputStream is = null;
        String body = null;
        StringBuilder res = new StringBuilder();
        // 设置完整的url
        URIBuilder uriBuilder = null;
        uriBuilder = new URIBuilder(url);
        //添加参数
        for (Map.Entry<String, String> entry : param.entrySet()) {
            uriBuilder.setParameter(entry.getKey(), entry.getValue());
        }
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.addHeader("Content-Type", "application/json");
        if (token != null) {
            httpGet.addHeader("token", token);
        }


        RequestConfig config = RequestConfig.custom().setConnectTimeout(5000).build();

        httpGet.setConfig(config);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            is = entity.getContent();
            //转换为字节输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is, Consts.UTF_8));
            while ((body = br.readLine()) != null) {
                res.append(body);
            }
        }
        Object jsonMap = JSON.parse(res.toString());
        return jsonMap;
    }
}
