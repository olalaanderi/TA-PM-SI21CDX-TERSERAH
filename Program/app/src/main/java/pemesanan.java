package com.example.tiketku.view.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tiketku.R;

public class pemesanan extends AppCompatActivity {

    ImageView imageprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Home);
            }
        });
    }
}