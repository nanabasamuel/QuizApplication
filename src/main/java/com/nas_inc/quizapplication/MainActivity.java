package com.nas_inc.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout nursing = findViewById(R.id.nursingLayout);
        final LinearLayout sociology = findViewById(R.id.sociologyLayout);
        final LinearLayout physics = findViewById(R.id.physicsLayout);
        final LinearLayout civilEngineering = findViewById(R.id.civilEngineeringLayout);
        final LinearLayout farming = findViewById(R.id.farmingLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName ="java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);

                nursing.setBackgroundResource(R.drawable.round_back_white10);
                sociology.setBackgroundResource(R.drawable.round_back_white10);
                physics.setBackgroundResource(R.drawable.round_back_white10);
                civilEngineering.setBackgroundResource(R.drawable.round_back_white10);
                farming.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        nursing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName ="nursing";

                nursing.setBackgroundResource(R.drawable.round_back_white_stroke10);

                java.setBackgroundResource(R.drawable.round_back_white10);
                sociology.setBackgroundResource(R.drawable.round_back_white10);
                physics.setBackgroundResource(R.drawable.round_back_white10);
                civilEngineering.setBackgroundResource(R.drawable.round_back_white10);
                farming.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        sociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName ="sociology";

                sociology.setBackgroundResource(R.drawable.round_back_white_stroke10);

                nursing.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                physics.setBackgroundResource(R.drawable.round_back_white10);
                civilEngineering.setBackgroundResource(R.drawable.round_back_white10);
                farming.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName ="physics";

                physics.setBackgroundResource(R.drawable.round_back_white_stroke10);

                nursing.setBackgroundResource(R.drawable.round_back_white10);
                sociology.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                civilEngineering.setBackgroundResource(R.drawable.round_back_white10);
                farming.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        civilEngineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName ="civilEngineering";

                civilEngineering.setBackgroundResource(R.drawable.round_back_white_stroke10);

                physics.setBackgroundResource(R.drawable.round_back_white10);
                nursing.setBackgroundResource(R.drawable.round_back_white10);
                sociology.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                farming.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        farming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName ="farming";

                farming.setBackgroundResource(R.drawable.round_back_white_stroke10);

                java.setBackgroundResource(R.drawable.round_back_white10);
                nursing.setBackgroundResource(R.drawable.round_back_white10);
                sociology.setBackgroundResource(R.drawable.round_back_white10);
                physics.setBackgroundResource(R.drawable.round_back_white10);
                civilEngineering.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

    }
}