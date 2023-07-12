package com.example.yulen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class daftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        Button btn = (Button)findViewById(R.id.button);
        TextView txt = (TextView)findViewById(R.id.textView2);
        btn.setOnClickListener(v -> openActivity());
        txt.setOnClickListener(v -> openActivity1());
    }
    public void openActivity() {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);

    }
    public void openActivity1() {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);

    }

}