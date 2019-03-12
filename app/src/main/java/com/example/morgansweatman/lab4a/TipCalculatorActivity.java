package com.example.morgansweatman.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;

public class TipCalculatorActivity extends AppCompatActivity {
    private TextView inputBill;
    private TextView inputTipPercentage;
    private TextView inputNumOfPeople;
    private TextView outputResult;

    public void onClick(View v) {
        // gather variables
        Double bill = Double.valueOf(inputBill.getText().toString());
        Double tip = Double.valueOf(inputTipPercentage.getText().toString());
        int party = Integer.valueOf(inputNumOfPeople.getText().toString());

        // add desired tip to bill and evenly split it between party members
        Double costPerPartyMember = (bill + (bill*(tip/100)))/party;

        // display result
        outputResult.setText(costPerPartyMember.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
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
        inputBill = findViewById(R.id.inputBill);
        inputTipPercentage = findViewById(R.id.inputTipPercentage);
        inputNumOfPeople = findViewById(R.id.inputNumOfPeople);
        outputResult = findViewById(R.id.outputResult);
    }

}
