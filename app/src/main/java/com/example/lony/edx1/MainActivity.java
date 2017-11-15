/*
* @Author Valon Shatrolli
* @ListActivity
* */

package com.example.lony.edx1;


import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends ListActivity {

    String[] names;


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent in = new Intent(this,ShowMessage.class);
        in.putExtra("message",greetingByTime(names[(int) id]));
        startActivity(in);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        names = getResources().getStringArray(R.array.friends);
        setListAdapter((ListAdapter)new ArrayAdapter<String>(this,R.layout.friend_item,names));




    }

    protected String greetingByTime(String name) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        String greetingMsg;

        if (hour>6&&hour<=12)
            greetingMsg=getString(R.string.goodmorning);
        else if (hour <= 17)
            greetingMsg=getString(R.string.goodafternoon);
        else if (hour <=21)
            greetingMsg=getString(R.string.goodevening);
        else
            greetingMsg=getString(R.string.goodnight);

        return greetingMsg + " " + name + "!";

    }



}




