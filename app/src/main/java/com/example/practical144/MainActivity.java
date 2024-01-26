package com.example.practical144;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView sv = findViewById(R.id.sv);
        LinearLayout lo = findViewById(R.id.lout);

        for (int i=1;i<=150;i++){
            TextView tx = new TextView(this);
            tx.setText("Text View"+i);
            lo.addView(tx);
        }
    }
}