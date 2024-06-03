package tictactoe;

public class Player {

    public String name;
    public  int id;

    public Piece symbol;
    Player(String name, int id, Piece symbol){
        this.name = name;
        this.id =id;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Piece getSymbol() {
        return symbol;
    }

    public void setSymbol(Piece symbol) {
        this.symbol = symbol;
    }
}
