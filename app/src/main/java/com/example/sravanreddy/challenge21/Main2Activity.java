package com.example.sravanreddy.challenge21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        page=findViewById(R.id.textView);
        page.setText(getIntent().getExtras().getString("Key"));
    }
}
