package tictactoe;

import java.util.List;
import java.util.Scanner;

public class Game {

    List<Player> players;
    Board board;
    boolean[][] freeSpaces;
    boolean winner = false;
    boolean isDraw = false;
    int count =0;

    Game(List<Player> players,Board board){
        this.players = players;
        this.board = board;
        freeSpaces = new boolean[board.board.length][board.board.length];
        for(int i=0;i<freeSpaces.length;i++){
            for (int j=0;j<freeSpaces[i].length;j++){
                freeSpaces[i][j] = true;
            }
        }

    }

    public void startGame(){


        while (!this.winner && !this.isDraw){
            int i=0,count=0;
            while(i < players.size()) {
                System.out.println("Present Position of Board is : ");
                board.printBoard();
                System.out.println("Please enter your position - " + players.get(i).name);
                Scanner sc = new Scanner(System.in);
                String s[] = sc.nextLine().split(" ");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);

                if (x > board.board.length - 1 || y > board.board.length - 1) {
                    System.out.println("Invalid values !!!");
                    System.out.println("Please enter valid values");
                } else {
                    if (freeSpaces[x][y]) {
                        placeSymbol(players.get(i).symbol, x, y, this.count);
                        if (this.winner) {
                            board.printBoard();
                            System.out.println("The winner is - " + players.get(i).name);
                            break;
                        }
                        if (this.isDraw) {
                            System.out.println("Game has been drawn...");
                            break;
                        }
                        i++;
                    } else {
                        System.out.println("Invalid values Selected!!!");
                    }

                }
            }

        }
    }

    private  void placeSymbol(Piece p, int x, int y, int count){

        board.board[x][y] = p;
        freeSpaces[x][y] = false;

        boolean isWinner = checkWinner(p, x,  y);
        this.count++;


        if(isWinner){
            this.winner = true;
        } else {
            if(this.count == board.board.length * board.board.length){
               this.isDraw = true;
            }
        }

    }

    private boolean  checkWinner(Piece p, int x, int y){

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDaigMatch = true;

        for(int i=0;i<board.board.length;i++){
            if(board.board[x][i] == null || board.board[x][i].symbol != p.symbol){
                rowMatch = false;
            }
        }

        for(int i=0;i<board.board[0].length;i++){
            if(board.board[i][y] == null || board.board[i][y].symbol != p.symbol){
              colMatch = false;
            }
        }

        for(int i=0,j=0; i<board.board.length ; i++,j++){

            if(board.board[i][j] == null || board.board[i][j].symbol != p.symbol){
               diagMatch= false;
            }
        }


        for(int i=0, j=board.board[0].length-1 ; i<board.board.length; i++, j--){
            if(board.board[i][j] == null || board.board[i][j].symbol != p.symbol){
                antiDaigMatch = false;
            }
        }

        return  rowMatch || colMatch || diagMatch || antiDaigMatch;
    }


}
