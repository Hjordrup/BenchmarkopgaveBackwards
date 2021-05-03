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

    ArrayList<Word> simpleArray = new ArrayList();

    public static final String EXTRA_MESSAGE =  "com.example.benchmarkopgave.extra.MESSAGE";
    public String wordToSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Metode der står for at lægge ordet i gemme listen
    public void startWord(View view) {
    EditText e1 = findViewById(R.id.editText1);
    wordToSend = e1.getText().toString();
    Word word = new Word(wordToSend);
    simpleArray.add(word);
    Intent intent = new Intent(MainActivity.this,Backwards.class);
    intent.putExtra(EXTRA_MESSAGE, word.getReverseWord());
    startActivity(intent);



    }
}