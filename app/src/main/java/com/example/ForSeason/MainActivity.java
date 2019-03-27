package com.example.ForSeason;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private TextView loginTextButton, signInButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          mAuth = FirebaseAuth.getInstance(); // Login-chk

        loginTextButton = findViewById(R.id.loginButton);
        loginTextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent goIntent = new Intent(MainActivity.this, CheckActivity.class);
                startActivity(goIntent);
                finish();
            }
        });

        signInButton = findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent goIntent = new Intent(MainActivity.this, CheckActivity.class);
                startActivity(goIntent);
                finish();
            }
        });


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        Intent goIntent = new Intent(MainActivity.this, OverallActivity.class);
        startActivity(goIntent);
        finish();
    }
}
