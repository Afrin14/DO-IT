package com.example.afrin.hello;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fourth extends ActionBarActivity {

    TextView textViewdate;
    TinyDB tinydb;
    Button b;
    String disp;
    String toggle;
    String done = "DONE";
    TextView display;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tinydb =  new TinyDB(getApplicationContext());

        Intent intent = getIntent();
        date = intent.getStringExtra(Second.DATE);

        textViewdate = (TextView) findViewById(R.id.date);
        textViewdate.setText(date);

        disp = tinydb.getString(date+"Task").toString();
        display = (TextView) findViewById(R.id.textView13);

        if (disp == "") {
                disp = "No Task Saved For This Day.";
         }

        display.setText(disp);

        b = (Button) findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent2;
            intent2 = new Intent(fourth.this, Fifth.class);
            intent2.putExtra(Second.DATE, date);
            startActivity(intent2);

            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle = done;
                final String disp =  tinydb.getString(toggle);
                display.setText(disp);
            }
        });
     }
}
