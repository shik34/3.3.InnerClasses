package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textV;

/*
    public void onClick(View x) {
        //Toast.makeText(MainActivity.this, "Bingo!", Toast.LENGTH_SHORT).show();
        textV.setText("1234456");
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button) findViewById(R.id.button);
        textV=(TextView) findViewById(R.id.tv);
        textV.setText("as");

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "Bingo!", Toast.LENGTH_SHORT).show();
                textV.setText("BUTTON");
            }
        };
        View.OnClickListener listenerTextV=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "qwerty!", Toast.LENGTH_SHORT).show();
                button.setText("TextView");
            }
        };
button.setOnClickListener(listener);
textV.setOnClickListener(listenerTextV);
    }

}