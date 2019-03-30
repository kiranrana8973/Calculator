package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1,btn2;
    private Button btnCalc;
    private Button btnAdd,btnSub;
    EditText etDisplay;

    boolean addBoolean,subBoolean;
    float value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub  = findViewById(R.id.btnSub);
        btnCalc = findViewById(R.id.btnCalc);
        etDisplay = findViewById(R.id.etDisplay);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnCalc.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn1:
                etDisplay.setText(etDisplay.getText().toString() + "1");
                break;

            case R.id.btn2:
                etDisplay.setText(etDisplay.getText().toString() + "2");
                break;

            case R.id.btnAdd:

                if(etDisplay==null)
                {
                    etDisplay.setText("");
                }
                else {

                    value1 = Float.parseFloat(etDisplay.getText().toString());
                    addBoolean = true;
                    etDisplay.setText("");
                }
                break;

            case R.id.btnSub:

                if(etDisplay==null)
                {
                    etDisplay.setText("");
                }
                else {

                    value1 = Float.parseFloat(etDisplay.getText().toString());
                    subBoolean = true;
                    etDisplay.setText("");
                }
                break;

            case R.id.btnCalc:
                value2 = Float.parseFloat(etDisplay.getText().toString());
                if(addBoolean)
                {
                    etDisplay.setText(value1+value2+"");
                }
                else if(subBoolean)
                {
                    etDisplay.setText(value1-value2+"");
                }

                break;
        }
    }
}
