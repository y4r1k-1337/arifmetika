package com.example.aleshenkov_arifmetika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Failure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Верный ответ " + String.valueOf(getIntent().getIntExtra("answer", 0)));
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Failure.this, MainActivity.class);
                intent.putExtra("counter",getIntent().getIntExtra("counter",0));
                startActivity(intent);
            }
        });
    }
}