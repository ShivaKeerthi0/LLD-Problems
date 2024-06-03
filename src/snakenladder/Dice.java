package snakenladder;

public class Dice {

    int sides ;
    Dice(int n){
        this.sides = n;
    }

    public int roll(int count){
        System.out.println("Dice is rolled by Player- "+ count);
        return (int) (Math.random() * (this.sides - 1)) + 1;

    }
}
