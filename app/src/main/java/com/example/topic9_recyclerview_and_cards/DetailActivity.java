package com.example.topic9_recyclerview_and_cards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //initialize the ImageView and title TextView
        TextView sportsTitle = (TextView)findViewById(R.id.titleDetail);
        ImageView sportsImage = (ImageView)findViewById(R.id.sportsImageDetail);
        //Get the title from the incoming Intent and set it to the TextView
        sportsTitle.setText(getIntent().getStringExtra("title"));
    //Use Glide to load the image into the ImageView
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);
    }
}