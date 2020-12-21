package com.android.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb01;
    ProgressBar pb02;
    Button progressBtn;
    Button resetBtn;
    Button showBtn;
    Button hideBtn;
    ImageView imgGif = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dlg dlg = com.android.progressbar.dlg.getInstance(this);
        dlg.show();

        pb01 = findViewById(R.id.pb_01);
        pb02 = findViewById(R.id.pb_02);

        progressBtn = findViewById(R.id.btn_01);
        resetBtn = findViewById(R.id.btn_02);
        showBtn = findViewById(R.id.btn_03);
        hideBtn = findViewById(R.id.btn_04);

        progressBtn.setOnClickListener(clickListener);
        resetBtn.setOnClickListener(clickListener);
        showBtn.setOnClickListener(clickListener);
        hideBtn.setOnClickListener(clickListener);

        imgGif = (ImageView)findViewById( R.id.imageView);

        Glide.with( this )
                .asGif()    // GIF 로딩
                .load( R.drawable.loading )
                .diskCacheStrategy( DiskCacheStrategy.RESOURCE )    // Glide에서 캐싱한 리소스와 로드할 리소스가 같을때 캐싱된 리소스 사용
                .into( imgGif );

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_01: // Progress Button
                    pb01.incrementProgressBy(10);
                    pb01.incrementSecondaryProgressBy(10);
                    break;
                case R.id.btn_02: // Reset Button
                    pb01.setProgress(0);
                    pb01.setSecondaryProgress(10);
                case R.id.btn_03: // Show Button
                    pb02.setVisibility(ProgressBar.VISIBLE);
                    break;
                case R.id.btn_04: // Hide Button
                    pb02.setVisibility(ProgressBar.INVISIBLE);
                    break;
            }
        }
    };
}