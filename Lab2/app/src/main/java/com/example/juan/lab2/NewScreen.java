package com.example.juan.lab2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class NewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_screen);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.textView4);
        textView.setText(message);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("New Screen");

        Button mBtn = (Button)findViewById(R.id.button);
        mBtn.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View view){
                startActivity(new Intent(NewScreen.this, MainActivity.class));
            }

        });
    }
}
