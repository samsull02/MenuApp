package com.samuel.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Tampilan_menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);

        // Referensi ke ImageView
        ImageView borderMayo = findViewById(R.id.border_mayo);
        ImageView borderSayur = findViewById(R.id.border_sayur);
        ImageView borderAyam = findViewById(R.id.border_ayam);
        ImageView borderSosis = findViewById(R.id.border_sosis);

        // Set OnClickListener untuk setiap ImageView
        borderMayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Risol Mayo
                Intent intent = new Intent(Tampilan_menu.this, Risol_Mayo.class);
                startActivity(intent);
            }
        });

        borderSayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Risol Sayur
                Intent intent = new Intent(Tampilan_menu.this, Risol_SayurActivity.class);
                startActivity(intent);
            }
        });

        borderAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Risol Ayam
                Intent intent = new Intent(Tampilan_menu.this, Risol_AyamActivity.class);
                startActivity(intent);
            }
        });

        borderSosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Risol Sosis
                Intent intent = new Intent(Tampilan_menu.this, Risol_SosisActivity.class);
                startActivity(intent);
            }
        });


        //referensi search
        EditText searchInput = findViewById(R.id.searchInput);
        ImageView searchButton = findViewById(R.id.searchIcon); // Ganti Button dengan ImageView

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyword = searchInput.getText().toString().trim();
                if (!keyword.isEmpty()) {
                    Toast.makeText(Tampilan_menu.this, "Mencari: " + keyword, Toast.LENGTH_SHORT).show();
                    // Lakukan proses pencarian di sini
                } else {
                    Toast.makeText(Tampilan_menu.this, "Masukkan kata kunci", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
