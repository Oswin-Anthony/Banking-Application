package com.example.bankingapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class transfer_activity extends AppCompatActivity
{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        listView = (ListView) findViewById(R.id.listview);

        ArrayList<String> arrayList =  new ArrayList<>();
        arrayList.add("android");
        arrayList.add("says");
        arrayList.add("fuck");
        arrayList.add("you");
        arrayList.add("oswin");
        arrayList.add("android");
        arrayList.add("says");
        arrayList.add("fuck");
        arrayList.add("you");
        arrayList.add("oswin");
        arrayList.add("android");
        arrayList.add("says");
        arrayList.add("fuck");
        arrayList.add("you");
        arrayList.add("oswin");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}