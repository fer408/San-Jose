package com.example.android.sanjosetour.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.sanjosetour.Data;
import com.example.android.sanjosetour.DataAdapter;
import com.example.android.sanjosetour.R;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);


        ArrayList<Data> words = new ArrayList<Data>();
        words.add(new Data(R.string.great_america_info, R.string.great_america_address ,R.drawable.greatamerica));
        words.add(new Data(R.string.raging_waters_info, R.string.raging_waters_address ,R.drawable.ragingwaters));
        words.add(new Data(R.string.santana_row_info, R.string.santana_row_address ,R.drawable.sanatanarow));
        words.add(new Data(R.string.downtown_san_jose_info, R.string.downtown_san_jose_address ,R.drawable.dtsj));

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
