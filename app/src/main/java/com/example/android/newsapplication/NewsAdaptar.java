package com.example.android.newsapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class NewsAdaptar extends ArrayAdapter<News> {


    private static final String LOCATION_SEPARATOR = " of ";

    /**
     * Constructs a new {@link NewsAdaptar}.
     *
     * @param context of the app
     * @param newss   is the list of news, which is the data source of the adapter
     */
    public NewsAdaptar(Context context, List<News> newss) {
        super(context, 0, newss);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of newss
        News currentNews = getItem(position);

        // Find the TextView with view news Title
        TextView FilmView = (TextView) listItemView.findViewById(R.id.section);
        // Display the news title in that TextView
        FilmView.setText(currentNews.getSectionName());
        // Get the original location string from the news object,


        // Find the TextView with view ID location
        TextView functionname = (TextView) listItemView.findViewById(R.id.primary_location);
        // Display the location of the current news in that TextView
        functionname.setText(currentNews.getWebTitle());


        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        // Display the date of the current news in that TextView
        dateView.setText(currentNews.getWebPublicationDate());

        // Find the TextView with view ID date
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);

        // Display the date of the current news in that TextView
        authorView.setText(currentNews.getAuthorName());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}

