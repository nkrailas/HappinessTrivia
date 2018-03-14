package com.example.android.happinesstrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Image: https://blogs.iadb.org/ideasmatter/2017/04/19/latin-americans-happier-gdp-suggest/

public class MainActivity extends AppCompatActivity {

    // This is the Start Quiz button.

    private Button startQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startQuiz = (Button) findViewById(R.id.button_start_quiz);

        // This method is called when the Start Quiz button is clicked.
        startQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();

            }
        });

    }

    // This intent start activity in Question 1.
    private void launchActivity() {

        Intent intent = new Intent(this, Question1.class);
        startActivity(intent);

    }
}