package chessgame;

public class Cell {
    public String color;
    public char i;
    public int j;

    public Piece p = null;

    Cell (String color, char i, int j){
        this.color = color;
        this.i = i;
        this.j =j;
    }
}
