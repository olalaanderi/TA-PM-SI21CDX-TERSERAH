package com.example.tiketku.view.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tiketku.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageprofile;
    Button btnpesanpenginapan, btnpesankapal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageprofile = (ImageView) findViewById(R.id.imageProfile);
        btnpesankapal = (Button) findViewById(R.id.btnpesankapal);
        btnpesanpenginapan = (Button) findViewById(R.id.btnpesanpenginapan);

        imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaRiwayat = new Intent(getApplicationContext(), Riwayat.class);
                startActivity(BukaRiwayat);
            }
        });

        btnpesankapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PesanKapal = new Intent(getApplicationContext(),PesanTiket.class);
                startActivity(PesanKapal);
            }
        });

        btnpesanpenginapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PesanPenginapan = new Intent(getApplicationContext(),Penginapan.class);
                startActivity(PesanPenginapan);
            }
        });
    }
}