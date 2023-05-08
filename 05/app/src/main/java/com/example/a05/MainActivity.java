package com.example.a05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty()){
                    username.setError("username required");
                }
                if(password.getText().toString().isEmpty()){
                    password.setError("password required");
                }
                if (password.getText().toString().isEmpty() == false){
                    if(password.getText().length() < 8){
                        password.setError("Password should be at least 8 characters");
                    }
                }
                if(password.getText().length() > 8 && username.getText().length()!=0){
                    Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}