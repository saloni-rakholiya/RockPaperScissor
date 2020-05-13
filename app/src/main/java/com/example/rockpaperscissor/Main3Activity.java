package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    private Button start;
    private TextView compshow;
    private TextView dets;
    private TextView round;
    private EditText no;
    private TextView score1;
    private TextView score2;
    private TextView name1;
    private TextView name2;
    private Button next;
    private Button restart;
    private TextView select;
    private ImageView r;
    private ImageView p;
    private ImageView compselect;
    private ImageView s;
    private TextView win;
    int n;
    int i=0;
    int points1=0;
    int points2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        start=(Button)findViewById(R.id.button7);
        no=(EditText)findViewById(R.id.editText4);
        next=(Button)findViewById(R.id.button8);
        restart=(Button)findViewById(R.id.button9);
        dets=(TextView)findViewById(R.id.textView15);
        round=(TextView) findViewById(R.id.textView16);
        score1=(TextView)findViewById(R.id.textView21);
        score2=(TextView) findViewById(R.id.textView20);
        name1=(TextView) findViewById(R.id.textView18);
        name2=(TextView) findViewById(R.id.textView19);
        select=(TextView) findViewById(R.id.textView17);
        r=(ImageView)findViewById(R.id.imageView2);
        p=(ImageView)findViewById(R.id.imageView);
        s=(ImageView)findViewById(R.id.imageView10);
        win=(TextView)findViewById(R.id.textView22);
        compshow=(TextView)findViewById(R.id.textView23);
        compselect=(ImageView)findViewById(R.id.imageView11);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.valueOf(no.getText().toString());
                dets.setVisibility(View.INVISIBLE);
                round.setVisibility(View.INVISIBLE);
                no.setVisibility(View.INVISIBLE);
                start.setVisibility(View.INVISIBLE);
                score2.setVisibility(View.VISIBLE);
                score1.setVisibility(View.VISIBLE);
                name1.setVisibility(View.VISIBLE);
                name2.setVisibility(View.VISIBLE);
                select.setVisibility(View.VISIBLE);
                r.setVisibility(View.VISIBLE);
                p.setVisibility(View.VISIBLE);
                s.setVisibility(View.VISIBLE);





                r.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r.setVisibility(View.INVISIBLE);
                        p.setVisibility(View.INVISIBLE);
                        s.setVisibility(View.INVISIBLE);
                        Random rn=new Random();
                        final int randomno=rn.nextInt(3);
                        if(randomno==1) {
                            points2 = points2 + 1;
                            compselect.setBackgroundResource(R.drawable.p);
                        }
                                else if(randomno==2) {
                            points1 = points1 + 1;
                            compselect.setBackgroundResource(R.drawable.s);
                        } else compselect.setBackgroundResource(R.drawable.r);
                                score1.setText(String.valueOf(points1));
                                score2.setText(String.valueOf(points2));
                        next.setVisibility(View.VISIBLE);
                        compshow.setVisibility(View.VISIBLE);
                        compselect.setVisibility(View.VISIBLE);

                    }
                });

                p.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r.setVisibility(View.INVISIBLE);
                        p.setVisibility(View.INVISIBLE);
                        s.setVisibility(View.INVISIBLE);
                        Random rn=new Random();
                        final int randomno=rn.nextInt(3);
                        if(randomno==0) {
                            points1 = points1 + 1;
                            compselect.setBackgroundResource(R.drawable.r);
                        }
                                else if(randomno==2) {
                            points2 = points2 + 1;
                            compselect.setBackgroundResource(R.drawable.s);
                        }
                                else compselect.setBackgroundResource(R.drawable.p);
                        score1.setText(String.valueOf(points1));
                        score2.setText(String.valueOf(points2));
                        next.setVisibility(View.VISIBLE);
                        compshow.setVisibility(View.VISIBLE);
                        compselect.setVisibility(View.VISIBLE);

                    }
                });

                s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        r.setVisibility(View.INVISIBLE);
                        p.setVisibility(View.INVISIBLE);
                        s.setVisibility(View.INVISIBLE);
                        Random rn=new Random();
                       final int randomno=rn.nextInt(3);
                        if(randomno==0) {points2=points2+1;
                        compselect.setBackgroundResource(R.drawable.r);}
                            else if(randomno==1) {points1=points1+1;
                            compselect.setBackgroundResource(R.drawable.p);}
                            else compselect.setBackgroundResource(R.drawable.s);
                        score1.setText(String.valueOf(points1));
                        score2.setText(String.valueOf(points2));
                        next.setVisibility(View.VISIBLE);
                        compshow.setVisibility(View.VISIBLE);
                        compselect.setVisibility(View.VISIBLE);



                    }
                });

                restart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        restart.setVisibility(View.INVISIBLE);
                        win.setVisibility(View.INVISIBLE);
                        points2=0;
                        points1=0;
                        i=0;
                        score1.setText(String.valueOf(points1));
                        score2.setText(String.valueOf(points2));

                        dets.setVisibility(View.VISIBLE);
                        round.setVisibility(View.VISIBLE);
                        select.setVisibility(View.INVISIBLE);
                        no.setVisibility(View.VISIBLE);
                        score1.setVisibility(View.INVISIBLE);
                        score2.setVisibility(View.INVISIBLE);
                        name1.setVisibility(View.INVISIBLE);
                        name2.setVisibility(View.INVISIBLE);
                        start.setVisibility(View.VISIBLE);
                    }
                });


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i=i+1;
                        compselect.setVisibility(View.INVISIBLE);
                        compshow.setVisibility(View.INVISIBLE);
                        if(i<n) { compshow.setVisibility(View.INVISIBLE);
                            next.setVisibility(View.INVISIBLE);
                            r.setVisibility(View.VISIBLE);
                            p.setVisibility(View.VISIBLE);
                            s.setVisibility(View.VISIBLE);
                            select.setVisibility(View.VISIBLE);

                        }
                        else {next.setVisibility(View.INVISIBLE);
                        restart.setVisibility(View.VISIBLE);
                        if(points1>points2)
                        {win.setText("YOU\nWIN");
                        win.setVisibility(View.VISIBLE);}
                        else if(points1<points2)
                        {
                            win.setText("OOPS\nYou Lost");
                            win.setVisibility(View.VISIBLE);
                        }
                        else if(points1==points2)
                        {win.setText("ITS A TIE");
                        win.setVisibility(View.VISIBLE);}
                        }
                    }
                });




            }
        });







    }
}
