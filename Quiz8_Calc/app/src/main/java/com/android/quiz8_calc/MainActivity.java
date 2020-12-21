package com.android.quiz8_calc;

import android.nfc.Tag;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1 = null;
    EditText num2 = null;
    EditText result = null;
    TextView textValue = null;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.v(TAG, "Start onCreate");
        result = findViewById(R.id.resultText);
        textValue = findViewById(R.id.textValue);
        num1 = findViewById(R.id.inputNum1);
        num2 = findViewById(R.id.inputNum2);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Log.v(TAG, "Start onOptionsItemSelected");
        switch (item.getItemId()){
            case R.id.action_menu01:
                textValue.setText("ADD RESULT");
                result.setText(TOT("add"));
                Log.v(TAG, "add");
                break;
            case R.id.action_menu02:
                textValue.setText("SUB RESULT");
                result.setText(TOT("sub"));
                Log.v(TAG, "sub");
                break;
            case R.id.menu_01:
                textValue.setText("MUL RESULT");
                result.setText(TOT("mul"));
                Log.v(TAG, "mul");
                break;
            case R.id.menu_02:
                textValue.setText("DIV RESULT");
                result.setText(TOT("div"));
                Log.v(TAG, "div");
                break;
        }
        return true;
    }

    private String TOT(String value){
        Log.v(TAG, "Start if");
        if(checkExcept() == false){
            Log.v(TAG, "if");
            Toast.makeText(MainActivity.this, "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
            return null;
        }else{

            double douTotal = 0;
            int intTotal = 0;
            String strTotal = "";
            int getNum1 = Integer.parseInt(num1.getText().toString());
            int getNum2 = Integer.parseInt(num2.getText().toString());
            Log.v(TAG, "else");

            switch (value){
                case "add":
                    intTotal = getNum1 + getNum2;
                    strTotal = Integer.toString(intTotal);
                    break;
                case "sub":
                    intTotal = getNum1 - getNum2;
                    strTotal = Integer.toString(intTotal);
                    break;
                case "mul":
                    intTotal = getNum1 * getNum2;
                    strTotal = Integer.toString(intTotal);
                    break;
                case "div":
                    douTotal = getNum1 / getNum2;
                    strTotal = Double.toString(douTotal);
                    break;
            }
            return strTotal;
        }


    }

    private boolean checkExcept(){
        Log.v(TAG, "Start checkExcept()");
        if(num1.getText().toString().length() == 0 || num1.getText().toString().length() == 0){
            Log.v(TAG, "false");
            return false;
        }else{
            Log.v(TAG, "true");
            return true;
        }
    }

}