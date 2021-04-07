package com.example.atividade3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        TextView date = findViewById(R.id.date);
        TextView time = findViewById(R.id.time);

        ConstraintLayout currentLayout = findViewById(R.id.mainLayout);

        Date current = new Date();

        String currentDate = new SimpleDateFormat("dd/MM/yyyy").format(current);
        String currentTime = new SimpleDateFormat("HH:mm").format(current);

        int hour = current.getHours();


        Log.i("data", currentDate);
        Log.i("time", currentTime);

        if (hour > 6 && hour < 13){
            String str = "Good Morning!";
            Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
            currentLayout.setBackgroundColor(Color.YELLOW);
            date.setText(currentDate);
            time.setText(currentTime);

        }
        else if (hour > 13 && hour < 19){
            String str = "Good Afternoon!";
            Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
            currentLayout.setBackgroundColor(Color.GREEN);
            date.setText(currentDate);
            time.setText(currentTime);
        }
        else {
            String str = "Good Night!";
            Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
            currentLayout.setBackgroundColor(Color.rgb(0,0,128));
            date.setText(currentDate);
            date.setTextColor(Color.WHITE);
            time.setText(currentTime);
            time.setTextColor(Color.WHITE);
        }
    }
}