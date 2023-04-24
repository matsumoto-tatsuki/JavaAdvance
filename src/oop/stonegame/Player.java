package oop.stonegame;

public class Player {
    String name;
    int wins;

    public Player(String name,int wins){
        this.name = name;
        this.wins = wins;
    }

    public void countUpWins(){
        wins++;
    }
}
