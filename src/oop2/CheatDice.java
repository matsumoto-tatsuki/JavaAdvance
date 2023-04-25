package oop2;

public class CheatDice extends Dice {
    int cheatNum;

    @Override
    public int cast(){
        cheatNum++;
        if(cheatNum == 6){
            cheatNum = 0;
            num = 6;
            return 6;
        }
        return super.cast();
    }
}
