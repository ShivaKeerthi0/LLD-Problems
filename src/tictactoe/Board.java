package tictactoe;

public class Board {
    public Piece[][] board;
    Board(int n){
        this.board = new Piece[n][n];
    }

    public void printBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] !=null){
                    System.out.print(board[i][j].symbol + "  |");
                } else {
                    System.out.print("  |");
                }

            }
            System.out.println();
        }


    }
}
