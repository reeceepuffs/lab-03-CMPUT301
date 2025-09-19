package com.example.listycitylab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CityArrayAdapter extends ArrayAdapter<City> {
    private Context context;
    public CityArrayAdapter(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup
            parent) {
        View view;

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.content,
                    parent, false);
        } else {
            view = convertView;
        }

        City city = getItem(position);
        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getName());
        provinceName.setText(city.getProvince());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the EditCityFragment when item is clicked
                EditCityFragment editFragment = new EditCityFragment(city, position);
                editFragment.show(((AppCompatActivity) context).getSupportFragmentManager(), "edit_city");
            }
        });

        return view;
    }
}