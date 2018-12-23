package com.mahayu.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TherdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.therd_layout);
        Intent intent=getIntent();
        String t=intent.getStringExtra("extra_data");
        TextView ts=(TextView)findViewById(R.id.thtxt);
        ts.setText(t);

    }
}
