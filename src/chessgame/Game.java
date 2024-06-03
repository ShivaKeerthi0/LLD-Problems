package chessgame;

import java.util.List;

public class Game {

    public Board board;
    public List<Player> players;
    public List<Move> movesPlayed;
    public GameStatus gameStatus;
    public  Player playerTurn;
    Game(Board board, List<Player> players ){
        this.board = board;
        this.players = players;
        this.gameStatus = GameStatus.STARTED;
        this.playerTurn = players.get(0); //always white starts
    }

    public void startGame(){
        this.board.resetBoard();
    }

    public void movePiece(Cell start , Cell end){

        if(validateMove(start,end)) {

            // updates the board configuration and adds move to the list of moves and changes the player turn
            this.board.updateBoardConfig(start, end);
            movesPlayed.add(new Move(playerTurn, start, end));
            //check whether the status of game is Changed
            this.updateGameStatus();
            playerTurn = playerTurn.color.equals("white") ? players.get(1) : players.get(0);
;
        } else{
            System.out.println("Invalid Move");
        }
    }

    private boolean validateMove(Cell start, Cell end){
        System.out.println("I will validate move");
        //it uses the start cell piece and check whether that piece is capable to move from start cell to end cell by using cell.piece.capabilityToMove method.

        return true;
    }

    private void updateGameStatus(){
        System.out.println("I will update the Status of the game after the move");
    }
}
