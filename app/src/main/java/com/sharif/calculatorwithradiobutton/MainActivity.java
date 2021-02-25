package com.sharif.calculatorwithradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView firsttextview, secondtextview;
    String Secondvalue, operator;
    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firsttextview = (TextView) findViewById(R.id.firsttextviewid);
        secondtextview = (TextView) findViewById(R.id.secondtextviewid);
    }

    public void resultfunction(View view) {
        num2 = Double.parseDouble(secondtextview.getText().toString());
        if (operator.equals("+")) {
            result = num1 + num2;
        } else {
            Toast.makeText(this, "Please insert the sumbutton", Toast.LENGTH_SHORT).show();
        }
        firsttextview.setText("" + num1 + " " + operator + " " + num2 + " " + "=");
        secondtextview.setText("" + result);
    }

    public void Intentfunction(View view) {
        if(view.getId()==R.id.radiobuttonid){
            Intent myintent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(myintent);
        }

    }

    public void operatorfunction(View view) {

        Secondvalue = secondtextview.getText().toString();
        num1 = Double.parseDouble(Secondvalue);
        //isNewOp=true;
        if (view.getId() == R.id.sumbuttonID) {
            operator = "+";
        } else {
            Toast.makeText(this, "Please Select the operation button", Toast.LENGTH_SHORT).show();
        }
        firsttextview.setText(Secondvalue+" "+operator);
        secondtextview.setText("0");
    }

    public void digitfunction(View view) {
        Secondvalue = secondtextview.getText().toString();


         if (view.getId() == R.id.oneButtonID) {
            if (Secondvalue.equals("1")) {
                secondtextview.setText("1");
            } else {
                secondtextview.setText(Secondvalue + "1");
            }
        } else if (view.getId() == R.id.twoButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("2");
            } else {
                secondtextview.setText(Secondvalue + "2");
            }
        } else if (view.getId() == R.id.threeButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("3");
            } else {
                secondtextview.setText(Secondvalue + "3");
            }
        } else if (view.getId() == R.id.fourButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("4");
            } else {
                secondtextview.setText(Secondvalue + "4");
            }
        } else if (view.getId() == R.id.fiveButtonID) {
            if (Secondvalue.equals("0")) {
                secondtextview.setText("5");
            } else {
                secondtextview.setText(Secondvalue + "5");
            }
        }
    }

    public void clearfunction(View view) {
        secondtextview.setText("");
        num1=0;
        num2=0;
        firsttextview.setText("");

    }
}
