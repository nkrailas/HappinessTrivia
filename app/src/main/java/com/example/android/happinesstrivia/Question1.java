package com.example.android.happinesstrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

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

                // Initialize CheckBoxes for Question 2
                CheckBox checkedEmail = findViewById(R.id.email);
                CheckBox checkedHobby = findViewById(R.id.hobby);
                CheckBox checkedFacebook = findViewById(R.id.facebook);
                CheckBox checkedPetting = findViewById(R.id.petting);
                CheckBox checkedVolunteering = findViewById(R.id.volunteering);
                boolean hasCheckedEmail = checkedEmail.isChecked();
                boolean hasCheckedHobby = checkedHobby.isChecked();
                boolean hasCheckedFacebook = checkedFacebook.isChecked();
                boolean hasCheckedPetting = checkedPetting.isChecked();
                boolean hasCheckedVolunteering = checkedVolunteering.isChecked();

                // Initialize CheckBoxes for Question 8
                CheckBox checkedBroccoli = findViewById(R.id.broccoli);
                CheckBox checkedMilk = findViewById(R.id.milk);
                CheckBox checkedNuts = findViewById(R.id.nuts);
                CheckBox checkedPears = findViewById(R.id.pears);
                CheckBox checkedTurkey = findViewById(R.id.turkey);
                boolean hasCheckedBroccoli = checkedBroccoli.isChecked();
                boolean hasCheckedMilk = checkedMilk.isChecked();
                boolean hasCheckedNuts = checkedNuts.isChecked();
                boolean hasCheckedPears = checkedPears.isChecked();
                boolean hasCheckedTurkey = checkedTurkey.isChecked();


                // Initialize Edit Text for Question 10
                EditText q10Field = findViewById(R.id.field_q10);
                String Yellow = q10Field.getText().toString();

                // Declare variable for score
                int score = 0;

                // Initialize RadioButtons for Questions 1, 3-7, and 9
                // Conditional statements used to calculate points for Questions 1-10
                if (((RadioButton) findViewById(R.id.button_20_minutes)).isChecked()) {
                    score++;
                }
                if (hasCheckedEmail & hasCheckedFacebook & !hasCheckedHobby & !hasCheckedPetting & !hasCheckedVolunteering) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_consumerism)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_norway)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_boulderCO)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_57F)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_floral)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_8h)).isChecked()) {
                    score++;
                }
                if (hasCheckedMilk & hasCheckedNuts & hasCheckedTurkey & !hasCheckedBroccoli & !hasCheckedPears) {
                    score++;
                }
                if (Yellow.contains("Yellow")) {
                    score++;
                }

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

    // Display Toast message with user greeting and quiz score
    private void displayResult(int score, String hasName) {
        String message = "Hi " + hasName + "! You scored " + score + " out of 10.";
        String message_10 = "\nCongrats! You got a perfect 10!";

        if (score == 10) {
            Toast.makeText(this, message + message_10, Toast.LENGTH_LONG).show();
        } else Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    private void launchActivity() {
        Intent intent = new Intent(this, Answer.class);
        startActivity(intent);
    }

}
