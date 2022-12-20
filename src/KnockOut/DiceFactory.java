package KnockOut;

public class DiceFactory {
    public Dice getDice(DiceType dice){
        if (dice == DiceType.YELLOW)
            return new YellowDice();
        else if (dice == DiceType.PINK){
            return new PinkDice();
        }
        else return null;
    }
}
