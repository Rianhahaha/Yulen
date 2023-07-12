package com.example.yulen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseADapter extends BaseAdapter {

        Context context;
        String getJudulGrup[];
        String getKetGrup[];
        LayoutInflater inflater;

    public  CustomBaseADapter(Context ctx, String[] JudulGrup, String[] KetGrup) {

        this.context = ctx;
        this.getJudulGrup = JudulGrup;
        this.getKetGrup =  KetGrup;
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
        convertView = inflater.inflate(R.layout.item_grup, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.Judul_grup);
        TextView txtView2 = (TextView) convertView.findViewById(R.id.KeterGrup);
        txtView.setText(getJudulGrup[position]);
        txtView2.setText(getKetGrup[position]);
        return convertView;
    }
}
