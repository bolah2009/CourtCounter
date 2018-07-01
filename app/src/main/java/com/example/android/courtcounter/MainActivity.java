package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
     * Increase the score for Team A by three (3) points
     */
    public void addThreePointsA(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by two (2) points
     */
    public void addTwoPointsA(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by one (1) point
     */
    public void addFreeThrowA(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     **********************  FOR  TEAM  B  **************************************
     */
    /**
     * Increase the score for Team B by three (3) points
     */
    public void addThreePointsB(View view) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by two (2) points
     */
    public void addTwoPointsB(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A by one (1) point
     */
    public void addFreeThrowB(View view) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Reset the score for Team A and Team B to zero (0) point
     */
    public void resetScore(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
