package com.example.juan.lab2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Main Activity");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.user){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage (View view) {
        Intent intent = new Intent (MainActivity.this, NewScreen.class);
        startActivity(intent);

        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);

        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();

        intent.putExtra("EXTRA_MESSAGE",message);
        intent.putExtra("EXTRA_MESSAGE_2",message2);
        startActivity(intent);
    }


}
