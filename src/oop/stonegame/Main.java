package oop.stonegame;

public class Main {
    public static void main(String[] args) {
        Player[] players ={new Player("aaa",0),
                new Player("bbb",0)};

        var game = new StoneGame(players);
        game.start();
    }
}
