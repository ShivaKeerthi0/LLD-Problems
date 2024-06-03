package tictactoe;

public class PieceX extends Piece{

    @Override
    public void configure(PieceType p) {
        super.symbol = p;
    }
}
