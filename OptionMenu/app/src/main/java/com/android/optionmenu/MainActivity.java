package com.android.optionmenu;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.SubMenu;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
    public boolean onCreateOptionsMenu(Menu menu) { // 옵션 보여주는 곳 (메뉴 디자인이 변화되는 경우는 이 메소드를 사용할 수 없다.)
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu); // res의 menu_main
        MenuItem item = menu.add(0, 1, 0, "짜장");
        menu.add(0, 2, 0, "짬뽕");
        SubMenu subMenu = menu.addSubMenu("기타");
        subMenu.add(0, 3, 0, "우동");
        subMenu.add(0, 4, 0, "만두");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // 옵션 선택한 거에 따라 실행
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case 1:
                Toast.makeText(MainActivity.this, "짜장은 달콤해", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Toast.makeText(MainActivity.this, "짬뽕은 매콤해", Toast.LENGTH_SHORT).show();
                return true;
            case 3:
                Toast.makeText(MainActivity.this, "우동은 시원해", Toast.LENGTH_SHORT).show();
                return true;
            case 4:
                Toast.makeText(MainActivity.this, "만두는 바삭해", Toast.LENGTH_SHORT).show();
                return true;
        }

        return false;
    }
}