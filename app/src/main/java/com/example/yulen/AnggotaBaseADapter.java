//package com.example.yulen;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//public class AnggotaBaseADapter extends BaseAdapter {
//
//        Context context;
//        String[] getNamaAnggota;
//        LayoutInflater inflater;
//
//    public AnggotaBaseADapter(Context ctx, String[] AnggotaGrup) {
//
//        this.context = ctx;
//         this.getNamaAnggota = AnggotaGrup;
//        inflater = LayoutInflater.from(ctx);
//
//    }
//
//    @Override
//    public int getCount() {
//        return getNamaAnggota.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        convertView = inflater.inflate(R.layout.item_anggota, null);
//        TextView txtView = (TextView) convertView.findViewById(R.id.anggota_list);
//        txtView.setText(getNamaAnggota[position]);
//        return convertView;
//    }
//}
