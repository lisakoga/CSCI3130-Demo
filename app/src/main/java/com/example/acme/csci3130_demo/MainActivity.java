package com.example.acme.csci3130_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     * The following code is added
     */
    public void textbox(View view)
    {
        TextView text1 = findViewById(R.id.textView);
        EditText text2 = findViewById(R.id.editText);
        text1.setText(text2.getText());
    }

}
