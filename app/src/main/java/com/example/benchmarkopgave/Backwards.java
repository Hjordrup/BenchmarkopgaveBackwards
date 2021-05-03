package com.example.benchmarkopgave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Backwards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backwards);
        Intent intent = getIntent();
        String word = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //String toPrint= reverseString(word);
        TextView t1 = findViewById(R.id.textView2);
        t1.setText(word);
    }






/*

    public String reverseString(String word){
        String reverse = " ";
        for(int i = word.length() - 1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
*/


}