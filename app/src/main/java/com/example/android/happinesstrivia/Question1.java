package com.example.android.happinesstrivia;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This class contains quiz questions, score button, and answer|bibliography button.
 */
public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        // Initialize Button for score to be displayed in Toast
        Button score = findViewById(R.id.button_score);
        score.setOnClickListener(new View.OnClickListener() {

            // This method is called when each RadioButton and CheckBox is clicked
            @Override
            public void onClick(View view) {

                // Initialize Edit Text for Name Field
                EditText nameField = findViewById(R.id.person_name);
                String hasName = nameField.getText().toString();

                // Initialize RadioButtons for Questions 1, 3-7, and 9
                RadioButton q1_correct = findViewById(R.id.button_20_minutes);
                RadioButton q3_correct = findViewById(R.id.button_consumerism);
                RadioButton q4_correct = findViewById(R.id.button_norway);
                RadioButton q5_correct = findViewById(R.id.button_boulderCO);
                RadioButton q6_correct = findViewById(R.id.button_57F);
                RadioButton q7_correct = findViewById(R.id.button_floral);
                RadioButton q9_correct = findViewById(R.id.button_7h);

                // Initialize CheckBoxes for Question 2
                CheckBox checkedEmail = findViewById(R.id.email);
                CheckBox checkedHobby = findViewById(R.id.hobby);
                CheckBox checkedFacebook = findViewById(R.id.facebook);
                CheckBox checkedPetting = findViewById(R.id.petting);
                CheckBox checkedVolunteering = findViewById(R.id.volunteering);
                boolean q2_CheckedEmail = checkedEmail.isChecked(); // Correct answer 1 of 2
                boolean q2_CheckedHobby = checkedHobby.isChecked();
                boolean q2_CheckedFacebook = checkedFacebook.isChecked(); // Correct answer 2 of 2
                boolean q2_CheckedPetting = checkedPetting.isChecked();
                boolean q2_CheckedVolunteering = checkedVolunteering.isChecked();

                // Initialize CheckBoxes for Question 8
                CheckBox checkedBroccoli = findViewById(R.id.broccoli);
                CheckBox checkedMilk = findViewById(R.id.milk);
                CheckBox checkedNuts = findViewById(R.id.nuts);
                CheckBox checkedPears = findViewById(R.id.pears);
                CheckBox checkedTurkey = findViewById(R.id.turkey);
                boolean q8_CheckedBroccoli = checkedBroccoli.isChecked();
                boolean q8_CheckedMilk = checkedMilk.isChecked(); // Correct answer 1 of 3
                boolean q8_CheckedNuts = checkedNuts.isChecked(); // Correct answer 2 of 3
                boolean q8_CheckedPears = checkedPears.isChecked();
                boolean q8_CheckedTurkey = checkedTurkey.isChecked(); // Correct answer 3 of 3

                // Initialize Edit Text for Question 10, include changing text to lower case
                EditText q10Field = findViewById(R.id.field_q10);
                String Yellow = q10Field.getText().toString().toLowerCase();

                // Declare variable for score
                int score = 0;

                // Conditional statements used to calculate points for Questions 1-10
                if (q1_correct.isChecked()) {score++;}
                if (q2_CheckedEmail && q2_CheckedFacebook && !q2_CheckedHobby && !q2_CheckedPetting && !q2_CheckedVolunteering) {score++;}
                if (q3_correct.isChecked()) {score++;}
                if (q4_correct.isChecked()) {score++;}
                if (q5_correct.isChecked()) {score++;}
                if (q6_correct.isChecked()) {score++;}
                if (q7_correct.isChecked()) {score++;}
                if (q8_CheckedMilk && q8_CheckedNuts && q8_CheckedTurkey && !q8_CheckedBroccoli && !q8_CheckedPears) {score++;}
                if (q9_correct.isChecked()) {score++;}
                if (Yellow.contains("yellow")) {score++;}

                // Input for Toast message with user greeting and quiz score
                displayResult(score, hasName);

            }

        });

        // This method is called with the Answer Key button is clicked
        Button answerKey = findViewById(R.id.button_answer);
        answerKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }

    /**
     * Display Toast message with user greeting and quiz score
     * @param score     Total score from quiz
     * @param hasName   Name inputted by user
     */

    public void displayResult(int score, String hasName) {
        String message = "Hi " + hasName + "! You scored " + score + " out of 10.";
        String message_10 = "\nCongrats! You got a perfect 10!";

        if (score == 10) {
            Toast.makeText(this, message + message_10, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This launches Answer Key page
     */
    private void launchActivity() {
        Intent intent = new Intent(this, Answer.class);
        startActivity(intent);
    }

}
