package com.example.android.sanjosetour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fernando on 8/25/16.
 */
public class DataAdapter extends ArrayAdapter{

    public DataAdapter(Context context, ArrayList<Data> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.data_list, parent, false);
        }

        Data currentData = (Data) getItem(position);


        TextView dataTextView = (TextView) listItemView.findViewById(R.id.data_text_view);

        dataTextView.setText(currentData.getmInfo());


        TextView addressTextView = (TextView) listItemView.findViewById(R.id.adress_text_view);

        addressTextView.setText(currentData.getmAdress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not

            // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(currentData.getImageResourceId());
            // Make sure the view is visible

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
