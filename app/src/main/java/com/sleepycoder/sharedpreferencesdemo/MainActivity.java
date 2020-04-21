package com.sleepycoder.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = getSharedPreferences("sharedpreferencesdemo",MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("key", "this is a new value");
        editor.apply();

        String value = prefs.getString("key", "value not found");
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }
}
