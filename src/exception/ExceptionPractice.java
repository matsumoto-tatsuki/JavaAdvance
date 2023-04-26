package exception;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args){
        String judge = null;
        while(true) {
            System.out.print("入力値：");
            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            try {
                var score = Integer.parseInt(s1);
                judge = judgeScore(score);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数値を入力してください");
            } catch (RuntimeException e) {
                System.out.println("スコアが不正です");
            }
        }
        System.out.println(judge);
    }
    public static String judgeScore(int score){
        if(score < 0 || score > 100){
            throw new IlligalScoreException();
        }else if(score >= 80){
            return "A";
        }else if(score >= 70){
            return "B";
        }else if (score >=60) {
            return "C";
        }else{
            return "D";
        }
    }
}
