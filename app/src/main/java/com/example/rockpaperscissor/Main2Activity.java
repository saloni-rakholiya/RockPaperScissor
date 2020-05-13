package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    private Button btn;
    private Button lastbtn;
    private EditText ed1;
    private EditText ed2;
    private EditText ed3;
    private TextView forscore1;
    private TextView forscore2;
    private TextView score1;
    private TextView score2;
    private TextView result;
    private TextView tag1;
    private TextView tag2;
    private TextView entername;
    private TextView entername2;
    private TextView enternumber;
    private ImageView r;
    private ImageView p;
    private ImageView s;
    private ImageView r1;
    private ImageView p1;
    private ImageView s1;
    private TextView enterdets;
    private Button next;


    String c;
    String y;
    int n;
    int i;
    int points1=0;
    int x=0;
    int points2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=(Button)findViewById(R.id.button2);
        entername=(TextView)findViewById(R.id.textView4);
        entername2=(TextView)findViewById(R.id.textView5);
        enternumber=(TextView)findViewById(R.id.textView6);
        ed1=(EditText)findViewById(R.id.editText2);
        ed2=(EditText)findViewById(R.id.editText);
        ed3=(EditText)findViewById(R.id.editText3);
        forscore1=(TextView) findViewById(R.id.textView8);
        forscore2=(TextView)findViewById(R.id.textView9);
        score1=(TextView)findViewById(R.id.textView11);
        score2=(TextView)findViewById(R.id.textView10);
        tag1=(TextView)findViewById(R.id.textView12);
        tag2=(TextView)findViewById(R.id.textView13);
        result=(TextView)findViewById(R.id.textView14);
        r=(ImageView)findViewById(R.id.imageView4);
        p=(ImageView)findViewById(R.id.imageView5);
        s=(ImageView)findViewById(R.id.imageView6);
        r1=(ImageView)findViewById(R.id.imageView7);
        p1=(ImageView)findViewById(R.id.imageView8);
        s1=(ImageView)findViewById(R.id.imageView9);
        enterdets=(TextView)findViewById(R.id.textView7);
        next=(Button)findViewById(R.id.button3);
        lastbtn=(Button)findViewById(R.id.button4);






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n=Integer.valueOf(ed3.getText().toString());
                c=ed1.getText().toString();
                y=ed2.getText().toString();


                forscore1.setText(c+" Score");
                forscore2.setText(y+" Score");

                entername.setVisibility(View.INVISIBLE);
                entername2.setVisibility(View.INVISIBLE);
                enternumber.setVisibility(View.INVISIBLE);
                ed1.setVisibility(View.INVISIBLE);
                ed2.setVisibility(View.INVISIBLE);
                ed3.setVisibility(View.INVISIBLE);

                forscore1.setVisibility(View.VISIBLE);
                enterdets.setVisibility(View.INVISIBLE);
                forscore2.setVisibility(View.VISIBLE);
                score1.setVisibility(View.VISIBLE);
                score2.setVisibility(View.VISIBLE);

                btn.setVisibility(View.INVISIBLE);



                tag1.setVisibility(View.VISIBLE);
                    r.setVisibility(View.VISIBLE);
                    p.setVisibility(View.VISIBLE);
                    s.setVisibility(View.VISIBLE);






                 { tag1.setVisibility(View.VISIBLE);
                r.setVisibility(View.VISIBLE);
                p.setVisibility(View.VISIBLE);
                s.setVisibility(View.VISIBLE);

                r.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tag1.setVisibility(View.INVISIBLE);
                        tag2.setVisibility(View.VISIBLE);
                        r.setVisibility(View.INVISIBLE);
                        p.setVisibility(View.INVISIBLE);
                        s.setVisibility(View.INVISIBLE);
                        r1.setVisibility(View.VISIBLE);
                        p1.setVisibility(View.VISIBLE);
                        s1.setVisibility(View.VISIBLE);

                        r1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);


                            }
                        });

                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                points2=points2+1;
                                score2.setText(String.valueOf(points2));
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);


                            }
                        });

                        s1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                points1=points1+1;
                                score1.setText(String.valueOf(points1));
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });



                    }
                });

                p.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tag1.setVisibility(View.INVISIBLE);
                        tag2.setVisibility(View.VISIBLE);
                        r.setVisibility(View.INVISIBLE);
                        p.setVisibility(View.INVISIBLE);
                        s.setVisibility(View.INVISIBLE);
                        r1.setVisibility(View.VISIBLE);
                        p1.setVisibility(View.VISIBLE);
                        s1.setVisibility(View.VISIBLE);

                        r1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                points1=points1+1;
                                score1.setText(String.valueOf(points1));
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });

                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });

                        s1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                points2=points2+1;
                                score2.setText(String.valueOf(points2));
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });


                    }
                });

                lastbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        x=0;
                        points1=0;
                        points2=0;
                        score1.setText(String.valueOf(points1));
                        score2.setText(String.valueOf(points2));
                        lastbtn.setVisibility(View.INVISIBLE);
                        ed1.setVisibility(View.VISIBLE);
                        ed2.setVisibility(View.VISIBLE);
                        ed3.setVisibility(View.VISIBLE);
                        entername.setVisibility(View.VISIBLE);
                        enternumber.setVisibility(View.VISIBLE);
                        entername2.setVisibility(View.VISIBLE);
                        enterdets.setVisibility(View.VISIBLE);
                        result.setVisibility(View.INVISIBLE);
                        btn.setVisibility(View.VISIBLE);
                    }
                });


                s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        tag1.setVisibility(View.INVISIBLE);
                        tag2.setVisibility(View.VISIBLE);
                        r.setVisibility(View.INVISIBLE);
                        p.setVisibility(View.INVISIBLE);
                        s.setVisibility(View.INVISIBLE);
                        r1.setVisibility(View.VISIBLE);
                        p1.setVisibility(View.VISIBLE);
                        s1.setVisibility(View.VISIBLE);


                        r1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                points2=points2+1;
                                score2.setText(String.valueOf(points2));
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });

                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                points1=points1+1;
                                score1.setText(String.valueOf(points1));
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });

                        s1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                r1.setVisibility(View.INVISIBLE);
                                p1.setVisibility(View.INVISIBLE);
                                s1.setVisibility(View.INVISIBLE);
                                tag2.setVisibility(View.INVISIBLE);
                                next.setVisibility(View.VISIBLE);

                            }
                        });


                    }
                });


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        x=x+1;
                        next.setVisibility(View.INVISIBLE);
                        if(x<n) {
                            r.setVisibility(View.VISIBLE);
                            p.setVisibility(View.VISIBLE);
                            s.setVisibility(View.VISIBLE);
                            tag1.setVisibility(View.VISIBLE);

                        }
                        else { if(points1>points2) result.setText(c+"\nWINS\n  !!!");
                        else if(points1<points2) result.setText(y+"\nWINS\n  !!!");
                        else if(points2==points1) result.setText("ITS A DRAW!!");
                            result.setVisibility(View.VISIBLE);
                            lastbtn.setVisibility(View.VISIBLE);
                        }

                    }
                });

                }





            }
        });



    }
}
