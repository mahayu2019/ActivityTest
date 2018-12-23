package com.mahayu.activitytest;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);  //加载自布局R-->layout,来自res/layout/first_layout.xml
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //#1
                // Toast.makeText(FirstActivity.this, "单击", Toast.LENGTH_SHORT).show();
                // finish();  //销毁活动

                //#2
                //Intent(译:意图)参数:(上下文对象,目标对象)
                // Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // startActivity(intent);//启动意图
                // Intent intent = new Intent("fact.sec");//意图目标参照androidManifest的intent-filter
                // startActivity(intent);

                //#3
                //String data = "传递数据";
                //指定从当前活动传递到指定活动
                //Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                // intent.putExtra("extra_data", data);
                // startActivity(intent);

                //#4 数据回传
                //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // startActivityForResult(intent, 1);

                //#5
                SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
            }
        });
    }

    @Override  //建立右上角菜单-->res/menu/main.xml
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;  //true--显示  false--隐藏
    }

    @Override  //菜单动作
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "移除", Toast.LENGTH_SHORT).show();
                break;
            default:
        }

        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String rtx = data.getStringExtra("data return");
                    TextView tr = (TextView) findViewById(R.id.returntx);
                    tr.setText(rtx);
                }
                break;
            default:

        }
    }


}
