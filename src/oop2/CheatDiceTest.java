package oop2;

public class CheatDiceTest {
    public static void main(String[] args){
        var dice = new CheatDice();
        for(var i = 0;i < 12;i++) {
            System.out.println("cast：" + dice.cast());
            System.out.println("see：" + dice.see());
        }
    }
}
