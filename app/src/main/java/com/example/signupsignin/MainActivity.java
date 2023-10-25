package com.example.signupsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_register;
    TextView signup,signin;
    ImageView img_fb,img_twit,img_google;
    Intent intent;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_register =findViewById(R.id.btn_reg);
        signin= findViewById(R.id.signin);
        signup=findViewById(R.id.signup);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Redirecting to Login Page", Toast.LENGTH_SHORT).show();

                intent=new Intent(MainActivity.this,SignIn.class);
                startActivity(intent);
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening Login Page", Toast.LENGTH_SHORT).show();
                intent=new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Opening Registration Page", Toast.LENGTH_SHORT).show();
                intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}