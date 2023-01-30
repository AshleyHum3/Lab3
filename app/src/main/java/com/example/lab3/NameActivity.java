package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        TextView Welcome = (TextView) findViewById(R.id.textView2);
        Button DontCallMeThat = (Button) findViewById(R.id.button2);
        Button ThankYou = (Button) findViewById(R.id.button3);
        Intent i = getIntent();
        String nText = i.getStringExtra("text");
        Welcome.setText(getString(R.string.name) + " " + nText + "!");

        DontCallMeThat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NameActivity.this, MainActivity.class);
                setResult(0, i);
                finish();
            }
        });

        ThankYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NameActivity.this, MainActivity.class);
                setResult(1, i);
                finish();
            }
        });
    }
}
