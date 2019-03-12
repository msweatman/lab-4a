package com.example.morgansweatman.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class FahrenheitToCelsiusConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius_converter);
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

        String f = ((EditText) findViewById(R.id.inputF)).getText().toString();
        String c = ((EditText) findViewById(R.id.inputC)).getText().toString();

        // Is Fahrenheit field empty?  If so, convert from Celsius

        if ( f.isEmpty() ) {

            // Check Celsius field first; if it is not empty, convert to Fahrenheit

            if ( !c.isEmpty() ) {

                double celsius = Double.parseDouble(c);
                double fahrenheit = ((celsius * 9 / 5) + 32);

                ((EditText) findViewById(R.id.inputF)).setText( Double.toString(fahrenheit) );

            }

        }

        // If Fahrenheit field is not empty, convert to Celsius

        else {
            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);

            ((EditText) findViewById(R.id.inputC)).setText( Double.toString(celsius) );
        }
    }
}
