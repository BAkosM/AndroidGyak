package com.example.gyakorlfeladat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText szoveg;
    private Button nagy;
    private Button kicsi;
    private Button velnt;
    private TextView szovegnez;
    private Random rnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        nagy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szovegnez.setText(szoveg.getText().toString().toUpperCase(Locale.ROOT));
            }
        });
        kicsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szovegnez.setText(szoveg.getText().toString().toLowerCase(Locale.ROOT));
            }
        });
        velnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(255);
                int green = rnd.nextInt(255);
                int blue = rnd.nextInt(255);
                szovegnez.setBackgroundColor(Color.rgb(red,green,blue));
            }
        });
    }
    private void init(){
        szoveg = findViewById(R.id.szoveg);
        nagy = findViewById(R.id.nagy);
        kicsi = findViewById(R.id.kis);
        velnt = findViewById(R.id.veletlen);
        szovegnez = findViewById(R.id.nez);
        rnd = new Random();
    }
}