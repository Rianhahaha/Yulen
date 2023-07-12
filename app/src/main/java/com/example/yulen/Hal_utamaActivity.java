package com.example.yulen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Hal_utamaActivity extends AppCompatActivity {
    private Button btnMasukGrup;
    Dialog dialog;

    String JudulGrup[] = {

            "Grup 1",
            "Grup 2",
            "Grup 3",
            "Grup 4",
            "Grup 5"

    };
    String KetGrup[] = {

            "Ket 1",
            "Ket 2",
            "Grup ini adalah grup 3 yang mana 3 itu adalah angka yang hebat",
            "ket4",
            "ket5"
    };

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hal_utama);
    listView = (ListView)  findViewById(R.id.grupList);
    CustomBaseADapter customBaseADapter = new CustomBaseADapter(getApplicationContext(), JudulGrup, KetGrup);
    listView.setAdapter(customBaseADapter);

        btnMasukGrup = findViewById(R.id.btnMasukGrup);
        dialog = new Dialog(this);




        btnMasukGrup.setOnClickListener(v -> {
            dialog.setContentView(R.layout.masuk_grup_modal);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        });


            Button btn = (Button)findViewById(R.id.btnBuatGrup);
             Button btn2 = (Button)findViewById(R.id.btnRiwayat);

            btn.setOnClickListener(v -> openActivity());
              btn2.setOnClickListener(v -> openActivity1());
        }
        public void openActivity() {
            Intent intent = new Intent(this, BuatActivity.class);
            startActivity(intent);

        }
        public void openActivity1() {
            Intent intent = new Intent(this, riwayatActivity.class);
            startActivity(intent);

        }


    }



