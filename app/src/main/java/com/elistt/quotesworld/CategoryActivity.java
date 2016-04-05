package com.elistt.quotesworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void showQuoteList(View v)
    {
        Intent quoteListIntent = new Intent(this, QuoteListActivity.class);
        switch (v.getId()) {
            case (R.id.Love_button):

                quoteListIntent.putExtra("Category_Name", "love");
                startActivity(quoteListIntent);
                break;

            case (R.id.Funny_button):

                quoteListIntent.putExtra("Category_Name", "funny");
                startActivity(quoteListIntent);
                break;

            case (R.id.Education_button):

                quoteListIntent.putExtra("Category_Name", "love");
                startActivity(quoteListIntent);
                break;

            case (R.id.Motivation_button):

                quoteListIntent.putExtra("Category_Name", "motivational");
                startActivity(quoteListIntent);
                break;

        }
    }
}
