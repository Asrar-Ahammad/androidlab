package com.example.a01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int ch = 1;
    int fontSize = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t=(TextView) findViewById(R.id.textView);
        Button b1 =(Button) findViewById(R.id.btnsize);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(fontSize);
                fontSize = fontSize+5;
                if (fontSize==50)
                    fontSize=30;
            }
        });
        Button b2 = (Button) findViewById(R.id.btncolor);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch){
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 3:
                        t.setTextColor(Color.GRAY);
                        break;
                    case 4:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 5:
                        t.setTextColor(Color.CYAN);
                        break;
                }
                ch++;
                if (ch==5)
                    ch = 1;
            }
        });

    }
}