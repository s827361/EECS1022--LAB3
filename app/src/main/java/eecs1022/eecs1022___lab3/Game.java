package eecs1022.eecs1022___lab3;

/**
 * Created by user on 2/14/18.
 */
public class Game {
    boolean gameOver;
    boolean gameOverError;

    String NAME1;
    String NAME2;
    int P1Score;
    int P2Score;

    Game () {
        this.P1Score= 0;
        this.P2Score = 0;
        this.gameOver = false;
        this.gameOverError = false;
    }

    void setName(String n1, String n2) {
        NAME1 = n1;
        NAME2 = n2;
    }

    void play(int round, String p1, String p2) {

        if (gameOver) {
            gameOverError = true;
        } else {
            if (p1.equals("Rock")) {
                if (p2.equals("Paper")) {
                    P2Score ++;
                } else if (p2.equals("Scissors")) {
                    P1Score ++;
                }
            } else if (p1.equals("Paper")) {
                if (p2.equals("Scissors")) {
                    P2Score ++;
                } else if (p2.equals("Rock")) {
                    P1Score ++;
                }
            } else {
                if (p2.equals("Rock")) {
                    P2Score ++;
                } else if (p2.equals("Paper")) {
                    P1Score ++;
                }
            }
        }

        if (P1Score == 2 | P2Score == 2 || round == 3) {
            gameOver = true;
        }
    }

    String toString(int round) {
        String s;
        if (round == 0) {
            s = "New Game Started.\nEnter names of players.";
        } else {
            if (gameOverError) {
                s = "Error: Game is already over.";
            } else {
                if (P1Score > P2Score) {
                    s = "Round " + round + " Finished: Winner is " + NAME1;
                } else if (P1Score < P2Score) {
                    s = "Round " + round + " Finished: Winner is " + NAME2;
                } else {
                    s =  "Round " + round + " Finished: Tie between " + NAME1 + " and " + NAME2;
                }
                if (gameOver) {
                    s += "\n";
                    s += "Game is Over.";
                }
            }
        }
        return s;
    }
}



