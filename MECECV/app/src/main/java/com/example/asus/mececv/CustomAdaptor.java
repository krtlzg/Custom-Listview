package com.example.asus.mececv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asus on 15.6.2017.
 */

public class CustomAdaptor extends BaseAdapter{

    private LayoutInflater userInflater;
    private ArrayList<HocaModeli> hocalistesi;


    public CustomAdaptor(Activity activity, ArrayList<HocaModeli> liste){
        hocalistesi=liste;
        userInflater= (LayoutInflater)activity.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return hocalistesi.size();
    }

    @Override
    public Object getItem(int position) {
        return hocalistesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View Satir;
        Satir=userInflater.inflate(R.layout.satirtasarim,null);

        ImageView logo= (ImageView)Satir.findViewById(R.id.imageViewresim);
        TextView bilgi= (TextView)Satir.findViewById(R.id.textViewbilgi);

        HocaModeli hoca=hocalistesi.get(position);

        logo.setImageResource(hoca.getLogoId());
        bilgi.setText(hoca.getIsimId());



        return Satir;
    }
}
