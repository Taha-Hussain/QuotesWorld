package com.elistt.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.elistt.model.Quotes;
import com.elistt.quotesworld.R;

import java.util.ArrayList;


/**
 * Created by Taha on 31/03/2016.
 */
public class QuotesAdapter extends ArrayAdapter<Quotes> {
    Context context;
    public QuotesAdapter(Context context, int resource, ArrayList<Quotes> objects) {
        super(context, resource, objects);
        this.context= context;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Quotes quotes = getItem(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_quote_list,parent,false);

        TextView QuoteText = (TextView) rowView.findViewById(R.id.quote_TextView);
        QuoteText.setText(quotes.getQuote_text());
        TextView QuoteAuthorText = (TextView) rowView.findViewById(R.id.quote_authorName_TextView);
        QuoteAuthorText.setText("'"+ quotes.getQuote_author()+ "'");

//        ImageView Background_ImageView = (ImageView) rowView.findViewById(R.id.background_image);
//        Background_ImageView.setImageDrawable(getResources().getDrawable(R.drawable.motivation_background));

//        Background_ImageView.setImageResource(context.getResources().getIdentifier("drawable/" + quotes.getQuote_Image(), null, context.getPackageName()));



        TextView quote_Category_TextView = (TextView) rowView.findViewById(R.id.quote_Category_TextView);

        quote_Category_TextView.setText(quotes.getQuote_category());

        return rowView;
    }
}
