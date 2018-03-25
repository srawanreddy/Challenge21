package com.example.sravanreddy.challenge21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
String page1;
String page2;
String page3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        page1=getString(R.string.page1_text);
        page2=getString(R.string.page2_text);
        page3=getString(R.string.page3_text);
    }

    public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent sendpage1=new Intent(MainActivity.this, Main2Activity.class);
                sendpage1.putExtra("Key", page1);
                startActivity(sendpage1);
                break;
            case R.id.button2:
                Intent sendpage2=new Intent(MainActivity.this, Main2Activity.class);
                sendpage2.putExtra("Key", page2);
                startActivity(sendpage2);
                break;
            case R.id.button3:
                Intent sendpage3=new Intent(MainActivity.this, Main2Activity.class);
                sendpage3.putExtra("Key", page3);
                startActivity(sendpage3);
                break;

        }
    }
}
