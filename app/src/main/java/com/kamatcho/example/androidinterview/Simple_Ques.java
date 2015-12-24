package com.kamatcho.example.androidinterview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Simple_Ques extends AppCompatActivity  {
    TextView Ques_Num,Ques_Total,Question,Answer;
    Button Answer_Question,Prev,Next;
    String[] Simple_Question, Simple_Answer;
    int index =0;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple__ques);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Strings array
        Simple_Question   = getResources().getStringArray(R.array.Simple_Ques_Arr);
        Simple_Answer     = getResources().getStringArray(R.array.Simple_ans_Arr);
        // text view values
        Ques_Num          =(TextView)findViewById(R.id.Ques_Num);
        Ques_Num.setText(String.valueOf(index+1));

        Ques_Total        =(TextView)findViewById(R.id.Ques_Total);
        Ques_Total.setText("/"+String.valueOf(Simple_Answer.length));

        Question          = (TextView)findViewById(R.id.Question);
        Question.setText(Simple_Question[index]);

        Answer            = (TextView)findViewById(R.id.Answer);
        Answer.setText("Press Answer Button To show Answer");

        // Buttons
        // Answer Button
        Answer_Question   = (Button)findViewById(R.id.Answer_Question);
        Answer_Question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Simple_Answer[index]);
            }
        });
        // Previous Button
        Prev              = (Button)findViewById(R.id.Prev);
        Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText("Press Answer Button To show Answer");
                index--;
                Question.setText(Simple_Question[index]);
                Ques_Num.setText(String.valueOf(index+1));

            }
        });
        // Next Button
        Next              = (Button)findViewById(R.id.Next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText("Press Answer Button To show Answer");
                index++;
                Question.setText(Simple_Question[index]);
                Ques_Num.setText(String.valueOf(index+1));

            }
        });









    }


}



