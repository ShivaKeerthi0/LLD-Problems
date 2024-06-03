package chessgame;

public class Move {

    Player player;
    Cell startCell;
    Cell endCell;

    Move(Player player, Cell startCell, Cell endCell){
        this.player = player;
        this.startCell = startCell;
        this.endCell = endCell;
    }
}
