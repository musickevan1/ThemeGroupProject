package com.example.themegroupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout.LayoutParams;



public class MainActivity2 extends MainActivity {
    Switch themeTog;
    TextView textView;
    ImageView paddle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        paddle = (ImageView)findViewById(R.id.playerPaddle);



        /*paddle.setOnTouchListener((v, event) -> {
            int yTap = (int) event.getY();
            paddle.setY(yTap);
            return true;
        }); Glitchy, but minimalistic. */





    }
    float y;
    float dy;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            y = event.getY();
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            dy = event.getY() - y;
            paddle.setY(paddle.getY() + dy);
            y = event.getY();
        }
        return super.onTouchEvent(event);
    }




}