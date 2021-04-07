package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultShow = findViewById(R.id.resultShow);
        String saved = getIntent().getStringExtra("result");

        if (saved.equals("0")){
            resultShow.setTextColor(Color.RED);
            resultShow.setText("Very large number!");
        }
        else {
            resultShow.setText(saved);
            resultShow.setTextColor(Color.BLUE);
        }



        findViewById(R.id.returnButton).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent it = new Intent(Result.this, MainActivity.class);
                        startActivity(it);
                    }
                }
        );
    }
}