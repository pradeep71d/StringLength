package com.example.stringlengthwithoutfunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "sampleString";
        int i = 0;
        for(char c: str.toCharArray()) {
            i++;
        }
        System.out.println("Length of the given string ::"+i);
    }
}
