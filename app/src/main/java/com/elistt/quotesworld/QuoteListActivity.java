package com.elistt.quotesworld;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.elistt.adapter.QuotesAdapter;
import com.elistt.model.QuoteDatasource;
import com.elistt.model.Quotes;

import java.util.ArrayList;

public class QuoteListActivity extends AppCompatActivity {

    QuoteDatasource quoteDatasource;
    QuotesAdapter quotesAdapter;
    ListView listViewQuotes;
    ArrayList<Quotes> array_list;
    Context context;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_list);
        context = this;
        new asyncTask_httpGet().execute();
        intent = getIntent();

    }

    public class asyncTask_httpGet extends AsyncTask<Void,Void,Void>{

        ProgressDialog dialog = new ProgressDialog(QuoteListActivity.this);
        @Override
        protected void onPreExecute() {
            dialog.setTitle("Please wait...");
            dialog.setMessage("Let The Fun Begin! ");
            dialog.show();
            array_list = new ArrayList<>();
            quoteDatasource = new QuoteDatasource();


            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            String url ="http://friendsfashion.net/android/Crawler/quotesJson.php?category=";
            String Category_Name = intent.getStringExtra("Category_Name");
            array_list = quoteDatasource.getList(url+Category_Name);
            return null;
             }

        @Override
        protected void onPostExecute(Void s) {

            listViewQuotes = (ListView) findViewById(R.id.quoteList_ListView);
            quotesAdapter = new QuotesAdapter(context,R.layout.row_quote_list, array_list);
            listViewQuotes.setAdapter(quotesAdapter);
            super.onPostExecute(s);
            dialog.dismiss();


        }
    }
}
