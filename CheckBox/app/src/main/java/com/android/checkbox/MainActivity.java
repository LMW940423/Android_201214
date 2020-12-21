package com.android.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toast toast = null;
    /*매개변수를 위한 선언!*/
    CheckBox chk1, chk2, chk3, chk4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1 = findViewById(R.id.chk_01);
        chk2 = findViewById(R.id.chk_02);
        chk3 = findViewById(R.id.chk_03);
        chk4 = findViewById(R.id.chk_04);

        /*체크박스는 모양이 바뀌기 때문에 clickListener가 아니다.*/
        chk1.setOnCheckedChangeListener(checkedChangeListener);
        chk2.setOnCheckedChangeListener(checkedChangeListener);
        chk3.setOnCheckedChangeListener(checkedChangeListener);
        chk4.setOnCheckedChangeListener(checkedChangeListener);
    }

    /*CheckBox는 CompoundButton, RadioButton은 RadioGroup */

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { //체크된 값은 boolean으로 알 수 있다.
            String str = "";
            ArrayList<String> arrayList = new ArrayList<String>();

            switch (buttonView.getId()){
                case R.id.chk_01:
                    if(isChecked == true){
                        arrayList.add(0, "운동");
                    }else{
                        arrayList.remove(0);
                    }
                    break;
                case R.id.chk_02:
                    if(isChecked == true){
                        arrayList.add(1, "요리");
                    }else{
                        arrayList.remove(1);
                    }
                    break;
                case R.id.chk_03:
                    if(isChecked == true){
                        arrayList.add(2, "독서");
                    }else{
                        arrayList.remove(2);
                    }
                    break;
                case R.id.chk_04:
                    if(isChecked == true){
                        arrayList.add(3, "여행");
                   }else{
                        arrayList.remove(3);
                    }
                    break;

            }

                toast = Toast.makeText(MainActivity.this, arrayList.get(arrayList.size()-1) , Toast.LENGTH_SHORT);
                toast.show();



        }
    };







} //----------------------