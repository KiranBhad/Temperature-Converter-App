package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TempConverter extends AppCompatActivity {

    EditText getTemp;
    TextView CtoF,FtoC,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        getTemp = findViewById(R.id.getTemp);
        CtoF = findViewById(R.id.cToF);
        FtoC = findViewById(R.id.fToC);
        result = findViewById(R.id.result);


        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(getTemp.getText().toString());

               double result1;
                result1 = (temp * 1.8) + 32;
                result.setText(String.valueOf("Result :"+result1 +"F"));

            }
        });

        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(getTemp.getText().toString());

                double result2 = (temp - 32) / 1.8;
                result.setText(String.valueOf("Result :"+result2 +"C"));
            }
        });
    }
}