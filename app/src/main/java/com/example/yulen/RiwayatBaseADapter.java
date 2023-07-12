package com.example.yulen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RiwayatBaseADapter extends BaseAdapter {

        Context context;
        int getLogo[];
        String getJudulGrup[];
        String getNominal[];
        String getVia[];
        String getDate[];
        LayoutInflater inflater;

    public RiwayatBaseADapter(Context ctx, int[] logo, String[] judulGrup, String[] nominal, String[] via, String[] date) {

        this.context = ctx;
        this.getJudulGrup = judulGrup;
        this.getNominal = nominal;
        this.getVia = via;
        this.getDate =  date;
        this.getLogo = logo;
        inflater = LayoutInflater.from(ctx);

    }

    @Override
    public int getCount() {
        return getJudulGrup.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_riwayat, null);
        TextView judul = (TextView) convertView.findViewById(R.id.judul_riwayat);
        TextView nom = (TextView) convertView.findViewById(R.id.nominal);
        TextView date = (TextView) convertView.findViewById(R.id.waktu);
        TextView via = (TextView) convertView.findViewById(R.id.via);
        ImageView logo = (ImageView) convertView.findViewById(R.id.logo);
        judul.setText(getJudulGrup[position]);
        nom.setText(getNominal[position]);
        date.setText(getDate[position]);
        via.setText(getDate[position]);
        logo.setImageResource(getLogo[position]);
        return convertView;
    }
}
