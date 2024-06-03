package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Piece p1 = new PieceX();
        p1.configure(PieceType.X);

        Piece p2 = new PieceO();
        p2.configure(PieceType.O);

        Player player_1 = new Player("shiva", 1, p1);
        Player player_2 = new Player("azad", 2, p2);
        List<Player>  players = new ArrayList();
        players.add(player_1);
        players.add(player_2);

        Board board = new Board(3);
        Game game = new Game(players, board);
        game.startGame();
    }
}
