package com.android.calculatorr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,eql,clr;
    EditText ans;
    float res1, res2;

    boolean Addition, Subtract, Multiplication, Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        eql = (Button) findViewById(R.id.eql);
        clr = (Button) findViewById(R.id.clr);
        ans = (EditText) findViewById(R.id.ans);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           ans.setText(ans.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans == null){
                    ans.setText("");
                }
                else{
                    res1 = Float.parseFloat(ans.getText() + "");
                    Addition = true;
                    ans.setText(null);

                }

        }});
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans == null){
                    ans.setText("");
                }
                else{
                    res1 = Float.parseFloat(ans.getText() + "");
                    Subtract = true;
                    ans.setText(null);

                }

            }});
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans == null){
                    ans.setText("");
                }
                else{
                    res1 = Float.parseFloat(ans.getText() + "");
                    Multiplication = true;
                    ans.setText(null);

                }

            }});
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans == null){
                    ans.setText("");
                }
                else{
                    res1 = Float.parseFloat(ans.getText() + "");
                    Division = true;
                    ans.setText(null);

                }

            }});
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ans.getText() + "");
                if (Addition == true) {
                    ans.setText(res1 + res2 + "");
                    Addition = false;

                }


                if (Subtract == true) {
                    ans.setText(res1 - res2 + "");
                    Subtract = false;
                }



                if (Multiplication == true) {
                    ans.setText(res1 * res2 + "");

                    Multiplication = false;
                }



                if (Division == true) {
                    ans.setText(res1 / res2 + "");
                    Division = false;
                }
            }});
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });


    }}