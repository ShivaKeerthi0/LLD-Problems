package chessgame;

public class Board {

    public Cell[][] board;

    Board(){
        this.board = new Cell[8][8];
    }

    public void resetBoard(){
        System.out.println("I am here to reset the board configuration to original status");
    }

    public void updateBoardConfig(Cell start, Cell end){

        System.out.println("Updates by moving a piece from start cell  to end cell");
    }

}
