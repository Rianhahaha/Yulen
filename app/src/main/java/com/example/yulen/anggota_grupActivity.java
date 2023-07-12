//package com.example.yulen;
//
//import android.os.Bundle;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class anggota_grupActivity extends AppCompatActivity {
//
//    String NamaAnggota[] = {
//
//            "Triandi Aprilio",
//            "Jean Gunhildr",
//            "Kitagawa Marin",
//            "Kujou Sara",
//            "Candace",
//            "Candace",
//            "Candace",
//            "Candace"
//
//    };
//
//    ListView listView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.anggota_grup);
//        listView = (ListView) findViewById(R.id.listAnggota);
//        AnggotaBaseADapter anggotaBaseADapter = new AnggotaBaseADapter(getApplicationContext(), NamaAnggota);
//        listView.setAdapter(anggotaBaseADapter);
//
//    }
//}
