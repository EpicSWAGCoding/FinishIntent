package com.example.finishintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView mTextView = findViewById(R.id.textView5);
        mTextView.setText((String)getIntent().getSerializableExtra("message"));
    }

    public void onClick3(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(intent);
    }
}