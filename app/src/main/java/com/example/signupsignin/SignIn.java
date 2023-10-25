package com.example.signupsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    Button btn_signin;
    TextView signup,signin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btn_signin=findViewById(R.id.btn_signin);
        signup= findViewById(R.id.signup);
        signin= findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this, "Opening Login Page", Toast.LENGTH_SHORT).show();
                intent=new Intent(SignIn.this, SignIn.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this, "Opening Registration Page", Toast.LENGTH_SHORT).show();
                intent=new Intent(SignIn.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                intent=new Intent(SignIn.this, HomePage.class);
                startActivity(intent);
            }
        });
    }
}