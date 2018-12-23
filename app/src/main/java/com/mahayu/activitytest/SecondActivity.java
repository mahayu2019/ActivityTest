package com.mahayu.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent("com.thr");
               // startActivity(intent);

                //#4 对应FirstActivity的#4 回传数据
                Intent intent=new Intent();
                intent.putExtra("data return","返回数据");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        TextView tx = (TextView) findViewById(R.id.tx);
        Intent intent = getIntent(); //接受数据准备
        String data = intent.getStringExtra("extra_data");
        tx.setText(data);
    }


    @Override  //按返回键时保证同样返回数据
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("data return","返回数据");
        setResult(RESULT_OK,intent);
        finish();
    }
}
