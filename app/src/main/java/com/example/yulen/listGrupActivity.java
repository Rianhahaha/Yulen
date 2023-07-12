//package com.example.yulen;
//
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class listGrupActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.anggota_grup);
//
//        ListView listView = findViewById(R.id.listAnggota);
//        List<String> list = new ArrayList<String>();
//        list.add("Anggota 1");
//        list.add("Anggota 2");
//        list.add("Anggota 3");
//        list.add("Anggota 4");
//        list.add("Anggota 5");
//        list.add("Anggota 6");
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
//        listView.setAdapter(arrayAdapter);
//    }
//}