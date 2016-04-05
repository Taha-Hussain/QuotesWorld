package com.elistt.http;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Taha on 01/04/2016.
 */
public class httpService {
//    private String url_about = "http://friendsfashion.net/android/Crawler/quotesJson.php";

    public String httpGet(String url) {
        String result="";
        final HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);
        try {
            HttpResponse mHttpResponse = httpClient.execute(httpGet);
            result = EntityUtils.toString(mHttpResponse.getEntity());
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
