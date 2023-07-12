package com.example.yulen;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tampilan_grupActivity extends AppCompatActivity {
    Button tagihan;
    Button anggota;
    private Button bayar;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_grup);


    tagihan = (Button)findViewById(R.id.btnTagihan);
        anggota = (Button)findViewById(R.id.btnAnggota);
        tagihan.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           tagihan.setTextColor(getResources().getColor(R.color.white));
                                           tagihan.setBackground(getResources().getDrawable(R.drawable.btn_menu_active));
                                           anggota.setTextColor(getResources().getColor(R.color.Hijau));
                                           anggota.setBackground(getResources().getDrawable(R.drawable.btn_menu));
                getSupportFragmentManager().beginTransaction().replace(R.id.grupView, new jml_tagihanActivity()).commit();

                                       }
                                   }

        );

        anggota.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           anggota.setTextColor(getResources().getColor(R.color.white));
                                           anggota.setBackground(getResources().getDrawable(R.drawable.btn_menu_active));
                                           tagihan.setTextColor(getResources().getColor(R.color.Hijau));
                                           tagihan.setBackground(getResources().getDrawable(R.drawable.btn_menu));
                                           getSupportFragmentManager().beginTransaction().replace(R.id.grupView, new list_anggotaActivity()).commit();
                                       }
                                   }
        );
        View inflatedView = getLayoutInflater().inflate(R.layout.metode_pem_modal, null);
        Button btn = (Button) inflatedView.findViewById(R.id.lanjut);
        btn.setOnClickListener(view -> setContentView(R.layout.pembayaran_berhasil));



        bayar = findViewById(R.id.button2);
        dialog = new Dialog(this);




        bayar.setOnClickListener(v -> {
            dialog.setContentView(R.layout.metode_pem_modal);

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        });







}


    public void onClick(View view) {
    }
}
