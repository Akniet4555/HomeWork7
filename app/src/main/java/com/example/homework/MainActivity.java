package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String oldNumber;
    String operator;
    private Boolean Operation;
    private Integer first, second;
    private Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }

    public void onNumberClick(View view) {
        String number = textView.getText().toString();
        switch (view.getId()) {
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;

            case R.id.btn_one:
                //нажал на единицу
                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;

            case R.id.btn_three:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;


            case R.id.btn_four:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;


            case R.id.btn_five:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;


            case R.id.btn_six:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.btn_seven:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:

                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;

            case R.id.tocka:
                if (dotIspresent(number)){
            }else {
                dotIspresent(number);
                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText(".");
                } else {
                    textView.append(".");
                }}
                break;

            case R.id.plus_minus:
                if (minusIsPresent(number)){
                    number = number.substring(1);
                if (textView.getText().toString().equals("0") || Operation) {
                    textView.setText("-");
                } else {
                    textView.append("-");
                }}
                break;


            case R.id.btn_clear:
                //нажал на очищение
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        Operation = false;
    }

    public boolean minusIsPresent(String number) {
        if (number.charAt(0) == '-'){
            return true;
        }else {
            return  false;
        }

    }

    public void Operation(View view) {
        Operation = true;
        oldNumber = textView.getText().toString();
        switch (view.getId()) {
            case R.id.btn_minus:
                operator = "-";
                break;
            case R.id.btn_plus:
                operator = "+";
                break;
            case R.id.btn_delenie:
                operator = "/";
                break;
            case R.id.btn_umnashenie:
                operator = "*";
                break;

        }
    }

    public void onEquals(View view) {
        String newNumber = textView.getText().toString();
        Double result = 0.0;

        switch (operator) {
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;


        }
        textView.setText(result + "");
    }

    public boolean dotIspresent(String number) {
        if (number.indexOf(".") == -1) {
            return false;
        }else {
            return true;
        }

    }
}


