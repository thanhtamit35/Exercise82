package com.example.exercise82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends ArrayAdapter<DataModel> {

    public DataAdapter(@NonNull Context context, @NonNull ArrayList<DataModel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_listview, parent, false);
        }

        // get the position of the view from the ArrayAdapter
        DataModel currentNumberPosition = getItem(position);

        // then according to the position of the view assign the desired image for the same
        ImageView numbersImage = currentItemView.findViewById(R.id.imageView);
        assert currentNumberPosition != null;
        numbersImage.setImageResource(currentNumberPosition.getInfo());

        // then according to the position of the view assign the desired TextView 1 for the same
        TextView txtName = currentItemView.findViewById(R.id.tw_name);
        txtName.setText(currentNumberPosition.getFullName());

        // then according to the position of the view assign the desired TextView 2 for the same
        TextView txtAddress = currentItemView.findViewById(R.id.tw_address);
        txtAddress.setText(currentNumberPosition.getAddress());

        TextView txtGender = currentItemView.findViewById(R.id.tw_gender);
        txtGender.setText(currentNumberPosition.getGender());

        // then return the recyclable view
        return currentItemView;
    }
}
