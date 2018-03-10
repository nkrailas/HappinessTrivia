package com.example.android.happinesstrivia;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Button score = (Button) findViewById(R.id.button_score);
        score.setOnClickListener(new View.OnClickListener() {

            // This method is called when each correct answer is clicked.
            @Override
            public void onClick(View view) {

                //If user inputs name
                EditText nameField = (EditText) findViewById(R.id.person_name);
                String hasName = nameField.getText().toString();

                int score = 0;
                if (((RadioButton) findViewById(R.id.button_hippocampus)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_20_minutes)).isChecked()) {
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
                if (((RadioButton) findViewById(R.id.button_3x)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_8h)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.button_yellow)).isChecked()) {
                    score++;
                }

                displayResult(score, hasName);
            }

        });
    }

    // Display toast for score.
    private void displayResult(int score, String hasName) {
        String message = "Hi " + hasName + "! You scored " + score + " out of 10.";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

}
