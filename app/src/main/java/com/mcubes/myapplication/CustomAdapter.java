package com.mcubes.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

              Context context;
              String[] countryName;
              int[] countyImg;

    CustomAdapter(Context context,String[] countryName,int[] countyImg){
        this.context = context;
        this.countryName = countryName;
        this.countyImg = countyImg;
    }




    @Override
    public int getCount() {
        return countryName.length;
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

        LayoutInflater layoutInflater;

        if (convertView == null){
            layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_view_colum,parent,false);



        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView2);

        imageView.setImageResource(countyImg[position]);
        textView.setText(countryName[position]);





        return convertView;
    }
}
