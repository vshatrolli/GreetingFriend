package com.example.lony.edx1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity  {

    Button greetButton;
    int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetButton = (Button) findViewById(R.id.greetButton);

        greetButton.setOnClickListener((a)->{
            TextView textMessage = (TextView) findViewById(R.id.textView);
            EditText editFriendName = (EditText) findViewById(R.id.editFriendName);
            String friendName = editFriendName.getText().toString();
            System.out.println(getString(R.string.goodafternoon));

            String greetingMsg;

            if (hour>6&&hour<=12)
                greetingMsg=getString(R.string.goodmorning);
            else if (hour <= 17)
                greetingMsg=getString(R.string.goodafternoon);
            else if (hour <=21)
                greetingMsg=getString(R.string.goodevening);
            else
                greetingMsg=getString(R.string.goodnight);

            
                textMessage.setText(greetingMsg+friendName+"!");







        } );
    }


}
