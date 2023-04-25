package oop2;

public class Dice {
     int num;

    public int cast(){
        num = (int)(Math.random() * 6) + 1;
        return num;
    }

    public int see(){
        if(num != 0){
            return num;
        }
        return 1;
    }
}
