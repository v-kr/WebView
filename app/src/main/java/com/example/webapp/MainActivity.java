package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.webapp.R.id.facebook1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.facebook1);
        b2= findViewById(R.id.instagram1);
        b3= findViewById(R.id.twitter1);
        b4= findViewById(R.id.youtube1);
        b5= findViewById(R.id.google1);
        b6= findViewById(R.id.gmail1);
        b7= findViewById(R.id.linkedin1);
        b8= findViewById(R.id.yahoo1);
        b9= findViewById(R.id.whatsapp1);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.facebook1:
                Intent faceintent = new Intent(MainActivity.this,Webactivity.class);
                faceintent.putExtra("uri","http://www.facebook.com");
                startActivity(faceintent);
                break;

            case R.id.google1:
                Intent googleintent = new Intent(MainActivity.this,Webactivity.class);
                googleintent.putExtra("uri","http://www.google.com");
                startActivity(googleintent);
                break;

            case R.id.instagram1:
                Intent instagramintent = new Intent(MainActivity.this,Webactivity.class);
                instagramintent.putExtra("uri","http://www.instagram.com");
                startActivity(instagramintent);
                break;

            case R.id.twitter1:
                Intent twitterintent = new Intent(MainActivity.this,Webactivity.class);
                twitterintent.putExtra("uri","http://www.twitter.com");
                startActivity(twitterintent);
                break;

            case R.id.youtube1:
                Intent youtubeintent = new Intent(MainActivity.this,Webactivity.class);
                youtubeintent.putExtra("uri","http://www.youtube.com");
                startActivity(youtubeintent);
                break;

            case R.id.gmail1:
                Intent gmailintent = new Intent(MainActivity.this,Webactivity.class);
                gmailintent.putExtra("uri","http://www.gmail.com");
                startActivity(gmailintent);
                break;

            case R.id.linkedin1:
                Intent linkedinintent = new Intent(MainActivity.this,Webactivity.class);
                linkedinintent.putExtra("uri","http://www.linkedin.com");
                startActivity(linkedinintent);
                break;

            case R.id.yahoo1:
                Intent yahoointent = new Intent(MainActivity.this,Webactivity.class);
                yahoointent.putExtra("uri","http://www.yahoo.com");
                startActivity(yahoointent);
                break;

            case R.id.whatsapp1:
                Intent whatsappintent = new Intent(MainActivity.this,Webactivity.class);
                whatsappintent.putExtra("uri","http://www.whatsapp.com");
                startActivity(whatsappintent);
                break;
        }

    }
}
