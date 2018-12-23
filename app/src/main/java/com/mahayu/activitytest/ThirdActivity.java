package com.mahayu.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.third_layout);
        // Intent intent=getIntent();
        // String t=intent.getStringExtra("extra_data");
        // TextView ts=(TextView)findViewById(R.id.thtxt);
        // ts.setText(t);
        Log.d("ThirdActivity", "Task id is" + getTaskId());
        setContentView(R.layout.third_layout);
        Button bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }
}
