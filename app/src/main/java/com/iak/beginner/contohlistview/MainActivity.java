package com.iak.beginner.contohlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void keSini(View view){
        Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
        this.startActivity(intent2);
    }
}
