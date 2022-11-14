package com.example.lab3_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    private TextView tv;
    private Button bt;
    private EditText et;
    private List<String> lista;
    ArrayAdapter<String> listaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text1);
        et = (EditText) findViewById(R.id.TextNou);
        bt = (Button) findViewById(R.id.buton);
        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                lista.add(et.getText().toString());
                et.setText("");
                listaAdapter.notifyDataSetChanged();
            }
        });
        lista = new ArrayList<String>();
        listaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lista);
        setListAdapter(listaAdapter);
    }

    @Override
    public void onListItemClick(ListView list, View v, int position, long id)
    {
        tv.setText(lista.get(position));
    }
}