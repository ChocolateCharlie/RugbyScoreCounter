/**
 * MainActivity.java
 * By : ChocolateCharlie
 * Last Updates : 04 - 01 - 2018
*/

package com.example.rugbyscorecounter;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



/**
 * MainActivity class
 * @author ChocolateCharlie
 *
 * Helps counting points during a rugby game :
 * - pressing on scoring buttons changes the displayed score
 * - pressing on reset button resets score to 0 - 0
 */
public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;     /* score of the team A */
    int scoreTeamB = 0;     /* score of the team B */

/**
 * onCreate
 * @param savedInstanceState
 *
 * This method is called at the creation of the class.
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/**
 * resetScores
 * @param view
 *
 * Reset both scoreTeamA (global variable) and scoreTeamB (global variable) to 0.
 */
    public void resetScores (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

        /* ************************************ */
        /*          DISPLAY METHODS             */
        /* ************************************ */

/**
 * displayForTeamA
 * @param score
 *
 * Displays the given score for Team A.
 */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

/**
 * displayForTeamB
 * @param score
 *
 * Displays the given score for Team B.
 */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

        /* ************************************ */
        /*          SCORE TEAM A METHODS        */
        /* ************************************ */

/**
 * addTwoForTeamA
 * @param view
 *
 * Add 2 points to team A's score
 */
    public void addTwoForTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;

        displayForTeamA(scoreTeamA);
    }

/**
 * addThreeForTeamA
 * @param view
 *
 * Add 3 points to team A's score
 */
    public void addThreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;

        displayForTeamA(scoreTeamA);
    }

/**
 * addFiveForTeamA
 * @param view
 *
 * Add 5 points to team A's score
 */
    public void addFiveForTeamA (View view) {
        scoreTeamA = scoreTeamA + 5;

        displayForTeamA(scoreTeamA);
    }

        /* ************************************ */
        /*          SCORE TEAM B METHODS        */
        /* ************************************ */

/**
 * addTwoForTeamB
 * @param view
 *
 * Add 2 points to team B's score
 */
    public void addTwoForTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);
    }

/**
 * addThreeForTeamB
 * @param view
 * Add 3 points to team B's score
 */
    public void addThreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);
    }

/**
 * addFiveForTeamB
 * @param view
 *
 * Add 5 points to team B's score
 */
    public void addFiveForTeamB (View view) {
        scoreTeamB = scoreTeamB + 5;

        displayForTeamB(scoreTeamB);
    }
}