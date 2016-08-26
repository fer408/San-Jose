package com.example.android.sanjosetour.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.sanjosetour.Data;
import com.example.android.sanjosetour.DataAdapter;
import com.example.android.sanjosetour.R;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Data> words = new ArrayList<Data>();
        words.add(new Data(R.string.japanese_museum_info, R.string.japanese_museum_address ,R.drawable.japan));
        words.add(new Data(R.string.tech_museum_info, R.string.tech_museum_address ,R.drawable.tech));
        words.add(new Data(R.string.childrens_museum_info, R.string.childrens_museum_address ,R.drawable.childrensmuseum));
        words.add(new Data(R.string.san_jose_art_info, R.string.san_jose_art_address ,R.drawable.artmuseum));


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
