package com.example.group3.csci3130_group3_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EmailLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        private FirebaseAuth mAuth;
        mAuth = FirebaseAuth.getInstance();
    }
}
