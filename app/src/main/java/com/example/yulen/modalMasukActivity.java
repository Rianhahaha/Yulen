package com.example.yulen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class modalMasukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masuk_grup_modal);

        Button btn = (Button)findViewById(R.id.btnMasukModal);
        btn.setOnClickListener(v -> openActivity());

    }
    public void openActivity() {
        Intent intent = new Intent(this, tampilan_grupActivity.class);
        startActivity(intent);

    }


}
