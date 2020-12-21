package com.android.editselect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit);

        findViewById(R.id.homeBtn).setOnClickListener(mClickListener);
        findViewById(R.id.endBtn).setOnClickListener(mClickListener);
        findViewById(R.id.selBlockBtn).setOnClickListener(mClickListener);
        findViewById(R.id.selAllBtn).setOnClickListener(mClickListener);
        findViewById(R.id.getSelBtn).setOnClickListener(mClickListener);

    }
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.homeBtn:
                    editText.setSelection(0);
                    break;
                case R.id.endBtn:
                    editText.setSelection(editText.getText().length());
                    break;
                case R.id.selBlockBtn:
                    editText.setSelection(3, 10);
                    break;
                case R.id.selAllBtn:
                    editText.selectAll();
                    break;
                case R.id.getSelBtn:
                    int start = editText.getSelectionStart();
                    int end = editText.getSelectionEnd();
                    Toast.makeText(MainActivity.this, "Start = " + start + " end = " + end, Toast.LENGTH_SHORT).show();

                    break;




            }
        }
    };
}