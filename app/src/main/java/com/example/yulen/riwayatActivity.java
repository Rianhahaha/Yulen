package com.example.yulen;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class riwayatActivity extends AppCompatActivity {


    String judul[] = {

            "Grup 1",
            "Grup 2",
            "Grup 3",
            "Grup 4",
            "Grup 5",
            "Grup 6"

    };
    String[] nominal = {

            "300.000",
            "50.000",
            "180.000",
            "110.000",
            "110.000",
            "55.000"
    };

    String[] date = {

            "13 Mar 2011, 22:24",
            "3 Mar 2024, 11:24",
            "10 Mar 2020, 01:14",
            "12 Mar 2023, 21:15",
            "22 Mar 2023, 18:10",
            "22 Des 2021, 18:10"
    };
    String[] via = {

            "Via Flip",
            "Via OVO",
            "Via Flip",
            "Via DANA",
            "Via DANA",
            "Via Flip"
    };

    int[] logo = {
            R.drawable.flip,
            R.drawable.ovo,
            R.drawable.flip,
            R.drawable.dana,
            R.drawable.dana,
            R.drawable.flip

    };



    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat);
        listView = (ListView)  findViewById(R.id.list_riwayat);
        RiwayatBaseADapter RBaseADapter = new  RiwayatBaseADapter(getApplicationContext(), logo ,nominal, date  , via, judul);
        listView.setAdapter(RBaseADapter);


            }

    }


