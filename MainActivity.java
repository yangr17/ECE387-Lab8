package com.example.ece387;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressedAdd(View view) {
        changePressedTimes();
    }

    public void changePressedTimes() {
        pressedTime++;
        TextView pressedTimeDis = (TextView) findViewById(R.id.result);
        pressedTimeDis.setText("" + pressedTime);
    }
}
