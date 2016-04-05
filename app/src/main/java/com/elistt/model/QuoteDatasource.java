package com.elistt.model;

import com.elistt.parser.quotesJsonParser;

import java.util.ArrayList;

/**
 * Created by Taha on 31/03/2016.
 */
public class QuoteDatasource  {

    public ArrayList<Quotes> getList(String url) {


        quotesJsonParser quotesParser = new quotesJsonParser();
        return quotesParser.getParsedQuotes(url);

//        ArrayList<Quotes> QuoteList = new ArrayList<Quotes>();
//
//        Quotes quote1 = new Quotes();
//        quote1.setQuote_id(1);
//        quote1.setQuote_text("If you want to be loved, be lovable.");
//        quote1.setQuote_author("Ovid");
//        quote1.setQuote_category("love");
//        quote1.setQuote_likes(1);
//        QuoteList.add(quote1);
//
//
//        Quotes quote2 = new Quotes();
//        quote2.setQuote_id(2);
//        quote2.setQuote_text("Love has a tide!");
//        quote2.setQuote_author("Helen Hunt Jackson");
//        quote2.setQuote_category("love");
//        quote2.setQuote_likes(2);
//        QuoteList.add(quote2);

//        return QuoteList;
    }
}
