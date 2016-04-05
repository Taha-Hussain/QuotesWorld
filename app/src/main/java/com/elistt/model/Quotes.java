package com.elistt.model;

/**
 * Created by Taha on 31/03/2016.
 */
public class Quotes {

    private int quote_id;
    private String quote_text;
    private String quote_author;
    private String quote_category;
    private int quote_likes;
    private String quote_Image;

    public String getQuote_Image() {
        return quote_Image;
    }

    public void setQuote_Image(String quote_image) {
        quote_Image = quote_image;
    }



    public int getQuote_id() {
        return quote_id;
    }

    public void setQuote_id(int quote_id) {
        this.quote_id = quote_id;
    }

    public String getQuote_text() {
        return quote_text;
    }

    public void setQuote_text(String quote_text) {
        this.quote_text = quote_text;
    }

    public String getQuote_author() {
        return quote_author;
    }

    public void setQuote_author(String quote_author) {
        this.quote_author = quote_author;
    }

    public String getQuote_category() {
        return quote_category;
    }

    public void setQuote_category(String quote_category) {
        this.quote_category = quote_category;
    }

    public int getQuote_likes() {
        return quote_likes;
    }

    public void setQuote_likes(int quote_likes) {
        this.quote_likes = quote_likes;
    }
}
