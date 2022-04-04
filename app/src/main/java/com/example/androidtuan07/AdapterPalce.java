package com.example.androidtuan07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class AdapterPalce extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Place> list;

    public AdapterPalce(Context context, int idLayout, List<Place> list) {
        this.context = context;
        this.idLayout = idLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
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
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);

        }
        Place place = list.get(position);

        TextView txtId = convertView.findViewById(R.id.textViewPlaceId);
        TextView txtName = convertView.findViewById(R.id.textViewPlaceName);

        txtId.setText(place.getId()+".");
        txtName.setText(place.getName());

        return convertView;
    }
}
