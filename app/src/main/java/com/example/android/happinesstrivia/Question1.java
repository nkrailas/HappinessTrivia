package com.example.android.happinesstrivia;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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

        // Access Button group and save as a variable named "score"
        Button score = (Button) findViewById(R.id.button_score);
        score.setOnClickListener(new View.OnClickListener() {

            // This method is called when each radio button and checkbox is clicked
            @Override
            public void onClick(View view) {

                //If user inputs name, then it is stored in a variable named "hasName"
                EditText nameField = findViewById(R.id.person_name);
                String hasName = nameField.getText().toString();

                //Access CheckBox group and save as a variable named "question2"
                CheckBox q2_email = findViewById(R.id.email);
                boolean has_q2_email = q2_email.isChecked();

                CheckBox q2_facebook = findViewById(R.id.facebook);
                boolean has_q2_facebook = q2_facebook.isChecked();

                CheckBox q2_hobby = findViewById(R.id.hobby);
                CheckBox q2_petting = findViewById(R.id.petting);
                CheckBox q2_volunteering = findViewById(R.id.volunteering);

                //Access CheckBox group and save as a variable named "question8"
                CheckBox q8_milk = findViewById(R.id.milk);
                boolean has_q8_milk = q8_milk.isChecked();

                CheckBox q8_nuts = findViewById(R.id.nuts);
                boolean has_q8_nuts = q8_nuts.isChecked();

                CheckBox q8_turkey = findViewById(R.id.turkey);
                boolean has_q8_turkey = q8_turkey.isChecked();


                CheckBox q8_broccoli = findViewById(R.id.broccoli);
                CheckBox q8_pears = findViewById(R.id.pears);


                // Initialize the variable named "score"
                int score = 0;

                // Conditional statements used to calculate points for each question

                if (((RadioButton) findViewById(R.id.button_20_minutes)).isChecked()) {
                    score++;
                }
                if ((has_q2_email) && (has_q2_facebook)) {
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
                if ((has_q8_milk) && (has_q8_nuts) && (has_q8_turkey)) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_8h)).isChecked()) {
                    score++;
                }


                displayResult(score, hasName);
            }

        });
    }

    // Display Toast with user greeting and final score
    private void displayResult(int score, String hasName) {
        String message = "Hi " + hasName + "! You scored " + score + " out of 10.";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

}
