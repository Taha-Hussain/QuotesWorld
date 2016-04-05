package com.elistt.parser;

import com.elistt.http.httpService;
import com.elistt.model.Quotes;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Taha on 01/04/2016.
 */
public class quotesJsonParser {

    public ArrayList<Quotes> getParsedQuotes(String url) {
        httpService MyHttpService = new httpService();
        ArrayList<Quotes> MyArraylist = new ArrayList<>();

        String JsonQuotes = MyHttpService.httpGet(url);
        try {
//            JSONArray jsonArray = new JSONArray(JsonQuotes);
            JSONObject jsonObject = new JSONObject(JsonQuotes);
            JSONArray quotesJsonArray = jsonObject.getJSONArray("quotations");
            for (int i = 0; i < quotesJsonArray.length(); i++) {
                Quotes quotes = new Quotes();
                JSONObject MyJsonObject = quotesJsonArray.getJSONObject(i);
                if(MyJsonObject.getString("quote").length()<60)
                {
                    quotes.setQuote_text(MyJsonObject.getString("quote"));
                    quotes.setQuote_author(MyJsonObject.getString("author_name"));
                    quotes.setQuote_category(MyJsonObject.getString("category"));
//                    quotes.setQuote_Image("motivation_background");
                    MyArraylist.add(quotes);
                }


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return MyArraylist;
    }
}
