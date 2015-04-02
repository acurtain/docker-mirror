package com.ai.paas.docker.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by astraea on 2015/4/2.
 */
public class HttpUtil {
    /**
     * do get request
     *
     * @param url
     * @return
     * @throws IOException
     */
    public static String doGet(String url) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response1 = httpclient.execute(httpGet);
        HttpEntity entity = response1.getEntity();
        if (response1.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response1.getStatusLine().getStatusCode());
        }

        BufferedReader br = new BufferedReader(
                new InputStreamReader((response1.getEntity().getContent())));

        String tmp;
        StringBuffer jsonResult = new StringBuffer();
        while ((tmp = br.readLine()) != null) {
            jsonResult.append(tmp);
        }

        EntityUtils.consume(entity);

        httpclient.close();

        return jsonResult.toString();
    }
}
