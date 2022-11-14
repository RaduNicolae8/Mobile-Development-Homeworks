package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button, button2;
    private EditText et;
    private String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = et.getText().toString();
                openActivity2();
            }
        });

        et = (EditText) findViewById(R.id.editTextTextPersonName);

    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }


}