package com.example.afrin.hello;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fifth extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.example.afrin.hello.Fifth.EXTRA_MESSAGE";
    TextView tv;
    EditText et;
    Button b;
    TinyDB tinydb;
    Button recieve;
    String tdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        recieve = (Button) findViewById(R.id.button8);
        et = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button5);
        tinydb = new TinyDB(getApplicationContext());

        Intent intent = getIntent();
        tdate = intent.getStringExtra(Second.DATE);
        tv = (TextView) findViewById(R.id.date2);
        tv.setText(tdate);
    }


    public void SaveTask(View view){
        tinydb.putString(tdate+"Task",et.getText().toString());
        Intent intent = new Intent(Fifth.this, fourth.class);
        intent.putExtra(Second.DATE, tdate);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Task saved", Toast.LENGTH_SHORT).show();
    }

    public void getSavedTask(View view){
        String task2Update = tinydb.getString("Task");
        Toast.makeText(getApplicationContext(), task2Update, Toast.LENGTH_SHORT).show();
    }

}
