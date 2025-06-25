package cond.ex;

import java.sql.SQLOutput;

public class ScoreEx {
    public static void main(String[] args){
        int score = 91;

        if (score >= 90) {
            System.out.println("score: " + score);
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
