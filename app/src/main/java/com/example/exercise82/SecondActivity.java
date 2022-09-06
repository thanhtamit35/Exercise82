package com.example.exercise82;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mapping();

        Intent intent = getIntent();
        ArrayList<DataModel> data = (ArrayList<DataModel>) intent.getSerializableExtra("data");
        DataAdapter adapter = new DataAdapter(this, data);
        list.setAdapter(adapter);
    }

    private void mapping() {
        list = findViewById(R.id.list);
    }
}
