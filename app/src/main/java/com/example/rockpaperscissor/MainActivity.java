package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
private Button btn5;
private Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.VISIBLE);
                btn6.setVisibility(View.VISIBLE);
    }

});
    }       public void openactivity2()
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }


    public void openactivity3()
    {Intent intent2=new Intent(this,Main3Activity.class);
        startActivity(intent2);}}