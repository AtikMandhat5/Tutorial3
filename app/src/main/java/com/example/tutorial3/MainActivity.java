package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, psw;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        psw=findViewById(R.id.psw);
    }

    public void login(View view) {

        if (name.length() == 0){
            Toast.makeText(this, "Please Enter Username", Toast.LENGTH_SHORT).show();
        }
        else if (psw.length() == 0){
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
        }
        else if (name.getText().toString().equals("admin@gmail.com") && psw.getText().toString().equals("admin"))
        {
            Toast.makeText(this, "Welcome to the page", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Toast.makeText(this, "Username and password is incorect...", Toast.LENGTH_SHORT).show();

        }
    }
}