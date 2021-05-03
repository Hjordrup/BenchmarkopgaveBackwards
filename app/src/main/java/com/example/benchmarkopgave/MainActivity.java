package com.example.benchmarkopgave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> simpleArray = new ArrayList();

    public static final String EXTRA_MESSAGE =  "com.example.benchmarkopgave.extra.MESSAGE";
    public String wordToSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startWord(View view) {
    EditText e1 = findViewById(R.id.editText1);
    wordToSend = e1.getText().toString();   
    simpleArray.add(wordToSend);
    Intent intent = new Intent(MainActivity.this,Backwards.class);
    intent.putExtra(EXTRA_MESSAGE, wordToSend);
    startActivity(intent);



    }
}