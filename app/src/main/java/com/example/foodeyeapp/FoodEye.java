package com.example.foodeyeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FoodEye extends AppCompatActivity {

    private TextView mHello;
    private EditText mName;
    private Button mButtonHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_eye);

        mHello = findViewById(R.id.main_textview_hello);
        mName = findViewById(R.id.main_edittext_name);
        mButtonHello = findViewById(R.id.main_button_hello);
    }
}