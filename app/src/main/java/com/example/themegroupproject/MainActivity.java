package com.example.themegroupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch themeTog;
    TextView textView;
    View backGrnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backGrnd = (View) findViewById(R.id.canvas);
        themeTog = (Switch) findViewById(R.id.modeSwitch);
        themeTog.setOnClickListener(changeTheme);
        textView = (TextView) findViewById(R.id.textView);

    }
    View.OnClickListener changeTheme = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            if (themeTog.isChecked() == true)
            {
                backGrnd.setBackgroundColor(Color.rgb(74,101,114));
                textView.setTextColor(Color.rgb(240,166,54));
                themeTog.setTextColor(Color.rgb(240,166,54));

            }
            else if (themeTog.isChecked() == false)
            {
                backGrnd.setBackgroundColor(Color.rgb(160,173,180));
                textView.setTextColor(Color.rgb(69,89,101));
                themeTog.setTextColor(Color.rgb(69,89,101));
            }
        }
    };

    public void play(View view) {
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }


}