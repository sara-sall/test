package com.example.receptapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecepieActivity extends AppCompatActivity {

    private String title;
    private String desc;
    private int image;
    private TextView titleText;
    private TextView descText;
    boolean isFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);

        titleText = (TextView) findViewById(R.id.recepieATitleID);
        descText = (TextView) findViewById(R.id.recepieADescID);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        if(b != null){
            title = (String) b.get("title");
            desc = (String) b.get("description");
            isFavorite = (boolean) b.get("isFav");


            titleText.setText(title);
            descText.setText(desc);
        }

        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if(isFavorite){
            fab.setImageResource(R.drawable.ic_favorite_white_24dp);

        }

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isFavorite){
                    fab.setImageResource(R.drawable.ic_favorite_white_24dp);
                    Snackbar.make(view, "Recept sparat i favoriter", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    isFavorite=true;
                }else{
                    fab.setImageResource(R.drawable.ic_favorite_border_white_24dp);
                    Snackbar.make(view, "Recept borttaget ur favoriter", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    isFavorite = (false);
                }

            }
        });
    }
}
