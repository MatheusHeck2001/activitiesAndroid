package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.calculate).setOnClickListener(
                new View.OnClickListener() {
                    int result = 1;


                    @Override
                    public void onClick(View v) {
                        EditText factorial = (EditText) findViewById(R.id.factorialNum);
                        int factorialInt = Integer.parseInt(factorial.getText().toString());



                        for (int i=1; i<=factorialInt; i++){
                            result *= i;
                        }


                        Intent it = new Intent(MainActivity.this, Result.class);
                        it.putExtra("result", String.valueOf(result));
                        startActivity(it);

                        Log.i("result", String.valueOf(result));
                    }
                }
        );
    }
}