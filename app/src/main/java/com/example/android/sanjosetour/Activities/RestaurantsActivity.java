package com.example.android.sanjosetour.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.sanjosetour.Data;
import com.example.android.sanjosetour.DataAdapter;
import com.example.android.sanjosetour.R;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Data> words = new ArrayList<Data>();
        words.add(new Data(R.string.sonoma_chicken_coop_info, R.string.sonoma_chicken_coop_address ,R.drawable.sonomachickencoop));
        words.add(new Data(R.string.original_joes_info, R.string.original_joes_adress ,R.drawable.originaljoes));
        words.add(new Data(R.string.fogo_de_chao_info, R.string.fogo_de_chao_address ,R.drawable.fogodechao));
        words.add(new Data(R.string.smash_burgers_info, R.string.smash_burgers_adress,R.drawable.smashburger));

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
