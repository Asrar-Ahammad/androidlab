package com.example.a07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private EditText nameEditText, emailEditText, phoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        phoneEditText = findViewById(R.id.phone);

        db = openOrCreateDatabase("UserDetails", Context.MODE_PRIVATE, null);

        Button saveButton = findViewById(R.id.btn);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.execSQL("CREATE TABLE IF NOT EXISTS user_details (name TEXT, email TEXT, phone TEXT)");
                db.execSQL("INSERT INTO user_details VALUES ('" +
                        nameEditText.getText().toString() + "', '" +
                        emailEditText.getText().toString() + "', '" +
                        phoneEditText.getText().toString() + "')");
                Toast.makeText(MainActivity.this, "Details saved", Toast.LENGTH_SHORT).show();
                nameEditText.setText("");
                emailEditText.setText("");
                phoneEditText.setText("");
            }
        });
    }
}