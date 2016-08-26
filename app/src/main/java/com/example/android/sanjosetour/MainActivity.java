package com.example.android.sanjosetour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.sanjosetour.Activities.AttractionsActivity;
import com.example.android.sanjosetour.Activities.HotelsActivity;
import com.example.android.sanjosetour.Activities.MuseumActivity;
import com.example.android.sanjosetour.Activities.RestaurantsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Buttons that connect to my buttons are created here
        Button btn1 = (Button)findViewById(R.id.museum_btn);
        Button btn2 = (Button)findViewById(R.id.attractions_btn);
        Button btn3 = (Button)findViewById(R.id.restaurants_btn);
        Button btn4 = (Button)findViewById(R.id.hotels_btn);


        //code that connects MainActivity to MuseumActivity(activity_museum)

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_second_activity = new Intent(MainActivity.this,MuseumActivity.class);
                startActivity(i_second_activity);
            }
        });

//code that connects MainActivity to AttractionsActivity(activity_attractions)

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_third_activity = new Intent(MainActivity.this,AttractionsActivity.class);
                startActivity(i_third_activity);
            }
        });

//code that connects MainActivity to RestaurantsActivity(activity_restaurants)

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_fourth_activity = new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(i_fourth_activity);
            }
        });

//code that connects MainActivity to HotelsActivity(activity_hotels)

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_fifth_activity = new Intent(MainActivity.this,HotelsActivity.class);
                startActivity(i_fifth_activity);
            }
        });


    }
}
