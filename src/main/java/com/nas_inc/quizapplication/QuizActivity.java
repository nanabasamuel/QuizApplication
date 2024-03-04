package com.nas_inc.quizapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
    private TextView questions;
    private TextView question;
    private AppCompatButton alternative1, alternative2, alternative3, alternative4;
    private AppCompatButton nextBtn;
    private Timer quizTimer;
    private int totalTimeInMins = 1;
    private int seconds = 0;
    private List<ListOfQuestions> questionsLists = new ArrayList<>();
    private int currentQuestionPosition =0;
    private String selectedAlternativeByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView clockTimer = findViewById(R.id.clockTimer);
        final TextView selectedTopicName = findViewById(R.id.topicName);

        questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);

        alternative1 = findViewById(R.id.alternative1);
        alternative2 = findViewById(R.id.alternative2);
        alternative3 = findViewById(R.id.alternative3);
        alternative4 = findViewById(R.id.alternative4);

        nextBtn = findViewById(R.id.nextBtn);

        //get Topic Name and User Name form MainActivity via Intent
        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        // set Topic name to TextView
        selectedTopicName.setText(getSelectedTopicName);

        //Get questions from firebase Data according to selectedTopicName and assign to questionsLists ArrayList
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://onlinequizapplication-f03bc-default-rtdb.firebaseio.com/");

        // show dialog while questions are being fetched
        ProgressDialog progressDialog = new ProgressDialog(QuizActivity.this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                // getting quiz time
                totalTimeInMins = Integer.parseInt(snapshot.child("time").getValue(String.class));

                // getting all questions from firebase database for a specific topic
                for (DataSnapshot dataSnapshot : snapshot.child(getSelectedTopicName).getChildren()) {

                    // getting all data from firebase database
                    final String getQuestion = dataSnapshot.child("question").getValue(String.class);
                    final String getAlternative1 = dataSnapshot.child("alternative1").getValue(String.class);
                    final String getAlternative2 = dataSnapshot.child("alternative2").getValue(String.class);
                    final String getAlternative3 = dataSnapshot.child("alternative3").getValue(String.class);
                    final String getAlternative4 = dataSnapshot.child("alternative4").getValue(String.class);
                    final String getAnswer = dataSnapshot.child("answer").getValue(String.class);

                    // adding data to the questionsList
                    ListOfQuestions listOfQuestions = new ListOfQuestions(getQuestion, getAlternative1, getAlternative2, getAlternative3, getAlternative4, getAnswer, "");
                    //WILL COME CHECK
                    questionsLists.add((ListOfQuestions) questionsLists);
                }

                // hide dialog
                progressDialog.hide();

                //set current question to TextView along with alternatives from questionsLists ArrayList
                questions.setText((currentQuestionPosition+1) + "/" + questionsLists.size());
                question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
                alternative1.setText(questionsLists.get(currentQuestionPosition).getAlternative1());
                alternative2.setText(questionsLists.get(currentQuestionPosition).getAlternative2());
                alternative3.setText(questionsLists.get(currentQuestionPosition).getAlternative3());
                alternative4.setText(questionsLists.get(currentQuestionPosition).getAlternative4());

                // start quiz countdown timer after data has fetched from firebase
                startTimer(clockTimer);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        // I used QuestionsBank for the offline version of this app so i won't need it here
        // questionsLists = QuestionsBank.getQuestions(getSelectedTopicName);


        alternative1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if (selectedAlternativeByUser.isEmpty()) {

                    selectedAlternativeByUser = alternative1.getText().toString();

                    alternative1.setBackgroundResource(R.drawable.round_back_red10);
                    alternative1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedAlternativeByUser);
                }
            }
        });

        alternative2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if (selectedAlternativeByUser.isEmpty()) {

                    selectedAlternativeByUser = alternative2.getText().toString();

                    alternative2.setBackgroundResource(R.drawable.round_back_red10);
                    alternative2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedAlternativeByUser);
                }
            }
        });

        alternative3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if (selectedAlternativeByUser.isEmpty()) {

                    selectedAlternativeByUser = alternative3.getText().toString();

                    alternative3.setBackgroundResource(R.drawable.round_back_red10);
                    alternative3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedAlternativeByUser);
                }
            }
        });

        alternative4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if (selectedAlternativeByUser.isEmpty()) {

                    selectedAlternativeByUser = alternative4.getText().toString();

                    alternative4.setBackgroundResource(R.drawable.round_back_red10);
                    alternative4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedAlternativeByUser);
                }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedAlternativeByUser.isEmpty()) {
                    Toast.makeText(QuizActivity.this, "Please select an alternative", Toast.LENGTH_SHORT).show();
                }
                else {
                    changeNextQuestion();
                }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    private void changeNextQuestion() {
        currentQuestionPosition++;

        if ((currentQuestionPosition+1) == questionsLists.size()) {
            nextBtn.setText("Submit Quiz");
        }

        if (currentQuestionPosition < questionsLists.size()) {

            selectedAlternativeByUser = "";

            alternative1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternative1.setTextColor(Color.parseColor("#1F6BB8"));

            alternative2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternative2.setTextColor(Color.parseColor("#1F6BB8"));

            alternative3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternative3.setTextColor(Color.parseColor("#1F6BB8"));

            alternative4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternative4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPosition+1) + "/" + questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            alternative1.setText(questionsLists.get(currentQuestionPosition).getAlternative1());
            alternative2.setText(questionsLists.get(currentQuestionPosition).getAlternative2());
            alternative3.setText(questionsLists.get(currentQuestionPosition).getAlternative3());
            alternative4.setText(questionsLists.get(currentQuestionPosition).getAlternative4());

        }
        else {
            Intent intent = new Intent(QuizActivity.this, QuizResults.class);
            intent.putExtra("correct", getCorrectAnswer());
            intent.putExtra("incorrect", getIncorrectAnswers());
            startActivity(intent);

            finish();
        }
    }
    private void startTimer(TextView timerTextViw) {
        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (seconds == 0) {
                    totalTimeInMins--;
                    seconds = 59;
                } else if (seconds == 0 && totalTimeInMins == 0) {

                    quizTimer.purge();
                    quizTimer.cancel();

                    Toast.makeText(QuizActivity.this, "Time Over", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("correct", getCorrectAnswer());
                    intent.putExtra("incorrect", getIncorrectAnswers());
                    startActivity(intent);

                    finish();
                }
                else {
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes = String.valueOf(totalTimeInMins);
                        String finalSeconds = String.valueOf(seconds);

                        if (finalMinutes.length() == 1) {
                            finalMinutes = "0" + finalMinutes;
                        }

                        if (finalSeconds.length() == 1) {
                            finalSeconds = "0" + finalSeconds;
                        }

                        timerTextViw.setText(finalMinutes + ":" + finalSeconds);
                    }
                });
            }
        },1000, 1000);
    }

    private int getCorrectAnswer() {
        int correctAnswers = 0;

        for (int i=0; i<questionsLists.size();i++) {

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }
        }

        return correctAnswers;
    }

    private int getIncorrectAnswers() {
        int correctAnswers = 0;

        for (int i=0; i<questionsLists.size();i++) {

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswers++;
            }
        }

        return correctAnswers;
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {

        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    @SuppressLint("ResourceAsColor")
    private void revealAnswer() {

        final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();

        if (alternative1.getText().toString().equals(getAnswer)) {
            alternative1.setBackgroundResource(R.drawable.round_back_green10);
            alternative1.setTextColor(Color.WHITE);

        } else if (alternative2.getText().toString().equals(getAnswer)) {
            alternative2.setBackgroundResource(R.drawable.round_back_green10);
            alternative2.setTextColor(Color.WHITE);

        } else if (alternative3.getText().toString().equals(getAnswer)) {
            alternative3.setBackgroundResource(R.drawable.round_back_green10);
            alternative3.setTextColor(Color.WHITE);

        } else if (alternative4.getText().toString().equals(getAnswer)) {
            alternative4.setBackgroundResource(R.drawable.round_back_green10);
            alternative4.setTextColor(Color.WHITE);
        }
    }
}