package com.example.android.footballstatistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballstatistics.R;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int ShotsA = 0;
    int ShotsB = 0;
    int shotsOnTargetA = 0;
    int shotsOnTargetB = 0;
    int totalShotsA = 0;
    int totalShotsB = 0;
    int gameShots = 0;
    int possessionTeamA = 0;
    int possessionTeamB = 0;

    Team teamA = new Team();
    Team teamB = new Team();
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
     * Displays Possession for Team A and B.
     */
    public void displayPossessionA(int possessionTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.possession_team_a);
        scoreView.setText(String.valueOf(possessionTeamA));
    }
    public void displayPossessionB(int possessionTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.possession_team_b);
        scoreView.setText(String.valueOf(possessionTeamB));
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
    public void GoalA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    //*BUTTON Shots for Team A/
    public void ShotsA(View view){
        ShotsA = teamA.ShotsA(ShotsA);
        possessionTeamA = teamA.possessionA(shotsOnTargetA,ShotsA,totalShotsB);
        displayShotsForTeamA(ShotsA);
        displayPossessionA(possessionTeamA);
    }

    //*Button shots on target and possession
    public void ShotsOnTargetA(View view){

        shotsOnTargetA=teamA.shotsOnTargetA(shotsOnTargetA);
        possessionTeamA = teamA.possessionA(shotsOnTargetA,ShotsA,totalShotsB);

        displayshotsOnTargetA(shotsOnTargetA);
        displayPossessionA(possessionTeamA);

    }

    class Team{
        int shotsOnTargetA = 0;
        //* Shots on target TeamA
        public int shotsOnTargetA(int shotsOnTargetA){
            shotsOnTargetA = shotsOnTargetA + 1;
            return shotsOnTargetA;
        }
        //*Possession Team A
        public int possessionA (int shotsOnTargetA, int ShotsA, int totalShotsB ){
            int totalShotsA = shotsOnTargetA + ShotsA;
            int gameShots = totalShotsA +totalShotsB;
            int possessionTeamA = (totalShotsA/gameShots)*100;
            return possessionTeamA;
        }
        //*BUTTON Shots for Team A/
        public int ShotsA (int ShotsA){
            ShotsA = ShotsA + 1;
            return ShotsA;
        }
        //*BUTTON Shots for Team B
        public int ShotsB (int ShotsB){
            ShotsB = ShotsB + 1;
            return ShotsB;
        }
        //*Possession Team B
        public int possessionB (int shotsOnTargetB, int ShotsB, int totalShotsA ){
            int totalShotsB = shotsOnTargetB + ShotsB;
            int gameShots = totalShotsA +totalShotsB;
            int possessionTeamB = (totalShotsB/gameShots)*100;
            return possessionTeamB;
        }
        //* Shots on target TeamB
        public int shotsOnTargetB(int shotsOnTargetB){
            shotsOnTargetB = shotsOnTargetB + 1;
            return shotsOnTargetB;
        }
    }



    //*BUTTON Goal for Team B/
    public void GoalB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    //*BUTTON Shots for Team B/
    public void ShotsB(View view){
        ShotsB = teamB.ShotsB(ShotsB);
        possessionTeamB = teamB.possessionB(shotsOnTargetB,ShotsB,totalShotsA);
        displayShotsForTeamB(ShotsB);
        displayPossessionB(possessionTeamB);
    }
    //*BUTTON Shots on Target for Team B/
    public void shotsOnTargetB(View view) {
        shotsOnTargetB = teamB.shotsOnTargetB(shotsOnTargetB);
        possessionTeamB = teamB.possessionB(shotsOnTargetB, ShotsB, totalShotsA);

        displayshotsOnTargetB(shotsOnTargetB);
        displayPossessionB(possessionTeamB);
    }




    //* ResetButton
    public void  Reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        ShotsA = 0;
        ShotsB = 0;
        shotsOnTargetA = 0;
        shotsOnTargetB = 0;
        possessionTeamA = 0;
        possessionTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayShotsForTeamA(ShotsA);
        displayShotsForTeamB(ShotsB);
        displayshotsOnTargetA(shotsOnTargetA);
        displayshotsOnTargetB(shotsOnTargetB);
        displayPossessionA(possessionTeamA);
        displayPossessionB(possessionTeamB);

    }

}