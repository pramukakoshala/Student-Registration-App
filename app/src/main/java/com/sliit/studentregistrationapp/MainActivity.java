package com.sliit.studentregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private int i=0;
    private EditText editTextStudentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewTitle);
        button = findViewById(R.id.button);

        textView.setText("Student Information");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("Info" , "clicked");

                //textView.setText("Student Information" + i);
                //i++;

                String val = editTextStudentName.getText().toString();
                textView.setText("Student Information :" + val);
            }
        });
    }
}