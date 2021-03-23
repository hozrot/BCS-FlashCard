package com.example.bcsflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button syllabus;
    Button quiz;
    Button flachcard;
    Button modeltest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz =(Button) findViewById(R.id.quizbutton);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });

        flachcard =(Button) findViewById(R.id.flashcardbutton);
        flachcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        modeltest =(Button) findViewById(R.id.modeltestbutton);
        modeltest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });


        syllabus = (Button) findViewById(R.id.syllabusButton);
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

    private void openQuizActivity() {
        Intent quizintent = new Intent(this, Quiz.class);
        startActivity(quizintent);
    }

    private void openNewActivity() {

        Intent modeltestintent = new Intent(this, FlashCardList.class);
        Intent flashcardintent = new Intent(this, FlashCard.class);
        Intent syllabusintent = new Intent(this, Syllabus.class);

        startActivity(modeltestintent);
        startActivity(flashcardintent);
        startActivity(syllabusintent);


    }
}