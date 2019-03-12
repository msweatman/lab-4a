package com.example.morgansweatman.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MilesToKilometersConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_kilometers_converter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View v) {

        String m = ((EditText) findViewById(R.id.inputM)).getText().toString();
        String k = ((EditText) findViewById(R.id.inputK)).getText().toString();

        // Is Miles field empty?  If so, convert from Kilometers

        if ( m.isEmpty() ) {

            // Check Miles field first; if it is not empty, convert to Kilometers

            if ( !k.isEmpty() ) {

                double kilometers = Double.parseDouble(k);
                double miles = kilometers/1.609344;

                ((EditText) findViewById(R.id.inputM)).setText( Double.toString(miles) );

            }

        }

        // If Fahrenheit field is not empty, convert to Celsius

        else {
            double miles = Double.parseDouble(m);
            double kilometers = miles * 1.609344;

            ((EditText) findViewById(R.id.inputK)).setText( Double.toString(kilometers) );
        }
    }
}
