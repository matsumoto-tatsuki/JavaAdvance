package oop.stonegame;

import java.util.Scanner;

public class StoneGame {
    Player[] players;
    final int totalNumberOfStones = 25;
    int numberOfStonesLeft;
    int playerIndex;

    public StoneGame(Player[] players){
        this.players = players;
        this.numberOfStonesLeft = totalNumberOfStones;
        this.playerIndex = 0;
    }

    private boolean judgeEnd(){
        if(numberOfStonesLeft < 0){
            return true;
        }
        return  false;
    }

    private  boolean next(){
        System.out.print("入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num = Integer.parseInt(s1);

        while(checkInput(num)){
            System.out.print("入力してください：");
            s1 = sc.nextLine();
            num = Integer.parseInt(s1);
        }
        numberOfStonesLeft -= num;
        for(var i = 0; i< numberOfStonesLeft;i++){
            System.out.print("*");
        }
        System.out.println();
        return judgeEnd();
    }

    private boolean checkInput(int num){
        if(num > 0 && num <= 3){
            return false;
        }
        System.out.println("入力値がエラーです");
        return true;
    }

    public void start(){
        System.out.println("""
                ------------------------------
                石取りゲームを開始します。
                石の総数：25個
                １度に取れる石の数：3個
                ------------------------------
                """);
        for(var i = 0; i< numberOfStonesLeft;i++){
            System.out.print("*");
        }
        System.out.println();
        var turn = 0;
        var bool = true;
        while(bool){
            System.out.println("-----------------------");
            System.out.println(players[turn].name + "の番です");
            bool = !next();
            turn ^= 1;

        }

        players[turn].countUpWins();
        System.out.println("win：" + players[turn].name);

    }



}
