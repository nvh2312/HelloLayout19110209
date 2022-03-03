package com.android.s19110209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutActivity extends AppCompatActivity {
    Button btnPortrait;
    Button btnLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        btnPortrait = (Button) findViewById(R.id.buttonPortrait);
        btnLandscape = (Button) findViewById(R.id.buttonLandscape);

        btnPortrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        });

        btnLandscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });
    }
}