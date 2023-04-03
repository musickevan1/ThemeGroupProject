package com.example.themegroupproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ParentActivity extends AppCompatActivity {
    TextView textView;
    View backGrnd;
    boolean currentTheme = false;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "Settings Icon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.changeTheme:
                backGrnd = (View) findViewById(R.id.canvas);
                textView = (TextView) findViewById(R.id.titleName);


                if(!currentTheme){
                    backGrnd.setBackgroundColor(Color.parseColor("#4a6572"));
                    //textView.setTextColor(Color.parseColor("#F0A636"));
                    item.setIcon(R.drawable.baseline_toggle_off_foreground);
                    currentTheme = true;
                }
                else {
                    backGrnd.setBackgroundColor(Color.parseColor("#A0ADB4"));
                    //textView.setTextColor(Color.parseColor("#E3D6D6"));
                    item.setIcon(R.drawable.baseline_toggle_on_foreground);
                    currentTheme = false;
                }
        }
        return super.onOptionsItemSelected(item);
    }
}
