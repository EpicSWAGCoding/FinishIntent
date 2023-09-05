package com.example.finishintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity2(View view) {
        mEditText = findViewById(R.id.editText);
        String message = mEditText.getText().toString();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}