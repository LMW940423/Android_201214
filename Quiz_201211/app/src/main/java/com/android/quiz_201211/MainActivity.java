package com.android.quiz_201211;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.inputEdit);
        addListener();
    }

    private void addListener(){
        Button insBtn = findViewById(R.id.insBtn);
        insBtn.setOnClickListener(mClickListener);

        findViewById(R.id.delBtn).setOnClickListener(mClickListener);
        findViewById(R.id.appBtn).setOnClickListener(mClickListener);
        findViewById(R.id.repBtn).setOnClickListener(mClickListener);
        findViewById(R.id.cleBtn).setOnClickListener(mClickListener);


    }

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Editable edit = editText.getText();

            switch (v.getId()){
                case R.id.insBtn:
                    edit.insert(0, "INS");
                    break;
                case R.id.delBtn:
                    edit.delete(2, 5);
                    break;
                case R.id.appBtn:
                    edit.append("APP");
                    break;
                case R.id.repBtn:
                    edit.replace(2, 5, "REP");
                    break;
                case R.id.cleBtn:
                    edit.clear();
                    break;
            }
        }
    };


}