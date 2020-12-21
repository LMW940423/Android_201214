package com.android.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast = null;
    RadioGroup radioGroup = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rg_01);
        radioGroup.setOnCheckedChangeListener(checkChangedListener);
    }

    RadioGroup.OnCheckedChangeListener checkChangedListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(toast != null){
                toast.cancel();
            }
            switch (checkedId){
                case R.id.rb_01:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_01), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.rb_02:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_02), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.rb_03:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_03), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.rb_04:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_04), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.rb_05:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_05), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.rb_06:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_06), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
                case R.id.rb_07:
                    toast = Toast.makeText(MainActivity.this, getString(R.string.area_07), Toast.LENGTH_SHORT);
                    toast.show();
                    break;
            }
        }
    };


}//------------