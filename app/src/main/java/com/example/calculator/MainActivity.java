package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer oldNumber, newNumber;
    private String operator;
    private Boolean isOperationClick;
    private Boolean equal = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                setNumber("0");
                break;
            case R.id.btn_one:
                setNumber("1");
                break;
            case R.id.btn_two:
                setNumber("2");
                break;
            case R.id.btn_three:
                setNumber("3");
                break;
            case R.id.btn_four:
                setNumber("4");
                break;
            case R.id.btn_five:
                setNumber("5");
                break;
            case R.id.btn_six:
                setNumber("6");
                break;
            case R.id.btn_seven:
                setNumber("7");
                break;
            case R.id.btn_eight:
                setNumber("8");
                break;
            case R.id.btn_nine:
                setNumber("9");
                break;
            case R.id.btn_clear:
                textView.setText("0");
                oldNumber = 0;
                newNumber = 0;
                break;
        }

    }

    private void setNumber(String number) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(number);
        } else if (isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
        isOperationClick = false;
    }



    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                operator = "+";
                oldNumber = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                operator = "-";
                oldNumber = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_multiplication:
                operator = "*";
                oldNumber = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
            case R.id.btn_division:
                operator = "/";
                oldNumber = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
        }
    }

    public void onEqualClick(View view) {
        Integer result;
        switch (operator) {
            case "+":
                newNumber = Integer.parseInt(textView.getText().toString());
                if (equal) {
                    result = oldNumber + newNumber;
                    textView.setText(result.toString());
                    equal = false;
                } else if (isOperationClick == false) {
                    result = oldNumber + newNumber;
                    textView.setText(result.toString());
                } else {
                    textView.getText();
                }
                isOperationClick = true;
                break;
            case "-":
                newNumber = Integer.parseInt(textView.getText().toString());
                if (equal) {
                    result = oldNumber - newNumber;
                    textView.setText(result.toString());
                    equal = false;
                } else if (isOperationClick == false) {
                    result = oldNumber - newNumber;
                    textView.setText(result.toString());
                } else {
                    textView.getText();
                }
                isOperationClick = true;
                break;
            case "*":
                newNumber = Integer.parseInt(textView.getText().toString());
                if (equal) {
                    result = oldNumber * newNumber;
                    textView.setText(result.toString());
                    equal = false;
                } else if (isOperationClick == false) {
                    result = oldNumber * newNumber;
                    textView.setText(result.toString());
                } else {
                    textView.getText();
                }
                isOperationClick = true;
                break;
            case "/":
                newNumber = Integer.parseInt(textView.getText().toString());
                if (equal) {
                    result = oldNumber / newNumber;
                    textView.setText(result.toString());
                    equal = false;
                } else if (isOperationClick == false) {
                    result = oldNumber / newNumber;
                    textView.setText(result.toString());
                } else {
                    textView.getText();
                }
                isOperationClick = true;
                break;
        }
    }
}