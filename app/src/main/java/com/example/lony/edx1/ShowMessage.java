package com.example.lony.edx1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent in = getIntent();
        String message = in.getStringExtra("message");

        TextView textView = (TextView) findViewById(R.id.textMessage);
        textView.setText(message);
    }
}
