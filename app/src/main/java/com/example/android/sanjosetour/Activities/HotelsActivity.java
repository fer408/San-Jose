package com.example.android.sanjosetour.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.sanjosetour.Data;
import com.example.android.sanjosetour.DataAdapter;
import com.example.android.sanjosetour.R;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Data> words = new ArrayList<Data>();
        words.add(new Data(R.string.hilton_info, R.string.hilton_address ,R.drawable.hilton));
        words.add(new Data(R.string.marriot_info, R.string.marriot_address ,R.drawable.marriot));
        words.add(new Data(R.string.fairmont_hotel_info, R.string.fairmont_hotel_address ,R.drawable.fairmont));
        words.add(new Data(R.string.valencia_hotel_info, R.string.valencia_hotel_address,R.drawable.valencia));

        DataAdapter adapter = new DataAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);
    }
}
