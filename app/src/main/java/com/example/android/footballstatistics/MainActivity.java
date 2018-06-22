package com.example.android.footballstatistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int ShotsA = 0;
    int ShotsB = 0;
    int shotsOnTargetA = 0;
    int shotsOnTargetB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Shots for Team A and B.
     */
    public void displayShotsForTeamA(int ShotsA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(ShotsA));
    }

    public void displayShotsForTeamB(int ShotsB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(ShotsB));
    }

    /**
     * Displays the given Shots On Target for Team A and B.
     */
    public void displayshotsOnTargetA(int shotsOnTargetA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots_on_target);
        scoreView.setText(String.valueOf(shotsOnTargetA));
    }

    public void displayshotsOnTargetB(int shotsOnTargetB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots_on_target);
        scoreView.setText(String.valueOf(shotsOnTargetB));
    }


    //*BUTTON Goal for Team A/
    public void GoalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    //*BUTTON Shots for Team A/
    public void ShotsA(View view) {
        ShotsA = ShotsA + 1;
        displayShotsForTeamA(ShotsA);
    }

    //*Button shots on target and possession
    public void ShotsOnTargetA(View view) {
        shotsOnTargetA = shotsOnTargetA + 1;
        displayshotsOnTargetA(shotsOnTargetA);
    }

    //*BUTTON Goal for Team B/
    public void GoalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    //*BUTTON Shots for Team B/
    public void ShotsB(View view) {
        ShotsB = ShotsB + 1;
        displayShotsForTeamB(ShotsB);
    }

    //*BUTTON Shots on Target for Team B/
    public void shotsOnTargetB(View view) {
        shotsOnTargetB = shotsOnTargetB + 1;
        displayshotsOnTargetB(shotsOnTargetB);
    }


    //* ResetButton
    public void Reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        ShotsA = 0;
        ShotsB = 0;
        shotsOnTargetA = 0;
        shotsOnTargetB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayShotsForTeamA(ShotsA);
        displayShotsForTeamB(ShotsB);
        displayshotsOnTargetA(shotsOnTargetA);
        displayshotsOnTargetB(shotsOnTargetB);

    }

}