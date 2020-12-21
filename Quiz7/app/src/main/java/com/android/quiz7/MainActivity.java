package com.android.quiz7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupWebSite;
    RadioButton radioButton;
    Button btnWebSiteNames;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Start");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerRadioButton();
        Log.v(TAG, "Start Listener");
    }

    private void addListenerRadioButton(){

        radioGroupWebSite = findViewById(R.id.radioGroup);
        btnWebSiteNames = findViewById(R.id.button);
        btnWebSiteNames.setOnClickListener(OnClickListener);
        Log.v(TAG, "Ready to Click");
    }
    View.OnClickListener OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selected = radioGroupWebSite.getCheckedRadioButtonId(); // 어느버튼을 눌렀는지 확인하는 값
            Log.v(TAG, Integer.toString(selected));

            radioButton = findViewById(selected); // 해당하는 버튼의 아이디값을 넣어서 해당 버튼을 선택
            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show(); // 해당 버튼의 text값을 불러낸다.

        }
    };

}//-------------