package com.example.payrollmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextPassword;
    Button btnSave;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.password);
        btnSave = findViewById(R.id.btn_login);


        btnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String username = editTextUsername.getText().toString();
                String pass = editTextPassword.getText().toString();

                if(username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("123") ){
                    Intent intent = new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(intent);
                }


            }
        });


    }
}
