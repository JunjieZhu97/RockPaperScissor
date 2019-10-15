package com.example.problem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView tvResult;
ImageView imgYourMove,imgComputerMove;
Button btnRock,btnPaper,btnScissor;
String YourChoice,ComputerChoice,Result;
int ComputerMove;
Random r=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult=findViewById(R.id.tvResult);
        imgYourMove=findViewById(R.id.imgYourMove);
        imgComputerMove=findViewById(R.id.imgComputerMove);
        btnRock=findViewById(R.id.btnRock);
        btnPaper=findViewById(R.id.btnPaper);
        btnScissor=findViewById(R.id.btnScissor);


        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YourChoice="Rock";
                imgYourMove.setImageResource(R.drawable.rock);
                Calculate();
            }
        });
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YourChoice="Paper";
                imgYourMove.setImageResource(R.drawable.paper);
                Calculate();
            }
        });
        btnScissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YourChoice="Scissor";
                imgYourMove.setImageResource(R.drawable.scissor);
                Calculate();
            }
        });
    }
    public void Calculate()
    {
        ComputerMove=r.nextInt(3);
        if(ComputerMove==0)
        {
            ComputerChoice="Rock";
            imgComputerMove.setImageResource(R.drawable.rock);
        }
        else if(ComputerMove==1)
        {
            ComputerChoice="Paper";
            imgComputerMove.setImageResource(R.drawable.paper);

        }
        else if(ComputerMove==2)
        {
            ComputerChoice="Scissor";
            imgComputerMove.setImageResource(R.drawable.scissor);

        }
        //check result(rock)
        if(YourChoice.equals("Rock") && ComputerChoice.equals("Rock"))
        {
            Result="Draw !!";
        }
        if(YourChoice.equals("Rock") && ComputerChoice.equals("Paper"))
        {
            Result="You Lose !!";
        }
        if(YourChoice.equals("Rock") && ComputerChoice.equals("Scissor"))
        {
            Result="You Win !!";
        }

        //check result(paper)
        if(YourChoice.equals("Paper") && ComputerChoice.equals("Rock"))
        {
            Result="You Win !!";
        }
        if(YourChoice.equals("Paper") && ComputerChoice.equals("Paper"))
        {
            Result="Draw !!";
        }
        if(YourChoice.equals("Paper") && ComputerChoice.equals("Scissor"))
        {
            Result="You Lose !!";
        }

        //check result(scissor)

        if(YourChoice.equals("Scissor") && ComputerChoice.equals("Rock"))
        {
            Result="You Lose !!";
        }
        if(YourChoice.equals("Scissor") && ComputerChoice.equals("Paper"))
        {
            Result="You Win !!";
        }
        if(YourChoice.equals("Scissor") && ComputerChoice.equals("Scissor"))
        {
            Result="Draw !!";
        }
tvResult.setText(Result);
    }
}
