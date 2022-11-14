package com.example.lab3_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    private TextView FirmaSelectata;
    private String[] s= {"Apple","LG","Samsung","Sony"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirmaSelectata = (TextView) findViewById(R.id.text1);
        setListAdapter(
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, s)
        );
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        FirmaSelectata.setText(s[position]);
    }
}