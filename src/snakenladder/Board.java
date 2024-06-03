package snakenladder;

public class Board {


   private  int dimensions;


   public  Xfactor [] snakes;
   public Xfactor [] ladders;

    Board(int n, Xfactor[] snakes, Xfactor[] ladders){
        this.dimensions = n;
        this.snakes = snakes;
        this.ladders = ladders;

    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
}
