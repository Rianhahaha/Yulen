package com.example.yulen;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BuatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buat_grup_page);


            Button btn = (Button)findViewById(R.id.btnBuatGrup);

            btn.setOnClickListener(v -> openActivity());

        }
        public void openActivity() {
            Intent intent = new Intent(this, tampilan_grupActivity.class);
            startActivity(intent);

        }





}
