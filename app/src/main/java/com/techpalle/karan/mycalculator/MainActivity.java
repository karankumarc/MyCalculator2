package com.techpalle.karan.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    // Decleration
    TextView textViewResult;
    EditText editTextFirst, editTextSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Memory created for the activity/blank screen
        setContentView(R.layout.activity_main); //Layout added to blank screen

        editTextFirst = (EditText) findViewById(R.id.edit_text_first);
        editTextSecond = (EditText) findViewById(R.id.edit_text_second_number);
        textViewResult = (TextView) findViewById(R.id.text_view_result);
    }


    public void onClickAdd(View view) {

        // Take the value from the edit text and convert into an integer
        int x = Integer.parseInt(editTextFirst.getText().toString());

        // Take the value from the second edit text and convert into an integer
        int y = Integer.parseInt(editTextSecond.getText().toString());

        // Calculate the result
        int result = x + y;

        // Set the result to the text view
        textViewResult.setText(String.valueOf(result));
    }

}
