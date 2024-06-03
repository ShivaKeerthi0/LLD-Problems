package snakenladder;

import java.util.Scanner;

public class Game {
    Board board;
    Player players[];
    Dice dice;

    public boolean gameFinished = false;

    Game(Board board, Player[] players, Dice dice){
        this.board = board;
        this.players = players;
        this.dice = dice;
    }


    public void startGame(){
        System.out.println("Game has Started");
        while(!gameFinished){
            for(int i=0; i<this.players.length;i++){
                System.out.println("Player -"+(i+1) +" enter roll to roll a dice - ");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                if(input.equals("roll")){
                    int getPosition = this.dice.roll(i+1);
                    System.out.println("getPosition for Player- "+(i+1)+" is "+getPosition);
                    this.updatePosition(i,getPosition);
                    if(this.gameFinished){
                        System.out.println("Game is completed!!!");
                        break;
                    }
                }

            }
        }
    }

    private void updatePosition(int playerIndex, int position){

        if(players[playerIndex].position + position == board.getDimensions()* board.getDimensions()){
            System.out.println("Player - "+ (playerIndex+1) +" is at "+ (players[playerIndex].position + position)  );
            System.out.println("Player - "+ (playerIndex+1) +" is the winner");
            this.gameFinished =true;
        }else if(players[playerIndex].position + position > board.getDimensions()* board.getDimensions()){
            System.out.println("Can't move the player");
        } else if(players[playerIndex].position + position < board.getDimensions()* board.getDimensions()){

            int newPosition = players[playerIndex].position + position;

            boolean bitten_by_snake = false;
            boolean climbed_ladder = false;


            for(int i =0 ; i<board.snakes.length ; i++){
                if(newPosition == board.snakes[i].start) {
                    players[playerIndex].position = board.snakes[i].end;
                    System.out.println("Player - "+ (playerIndex+1) +" is at "+newPosition);
                    break;
                }
            }

            if(!bitten_by_snake){
                for(int i=0 ; i< board.ladders.length ; i++){
                    if(newPosition == board.ladders[i].start){
                        players[playerIndex].position = board.ladders[i].end;
                        System.out.println("Player - "+ (playerIndex+1) +" is at "+newPosition);
                        break;
                    }
                }
            }

           if(!bitten_by_snake && !climbed_ladder){
               players[playerIndex].position = newPosition;
               System.out.println("Player - "+ (playerIndex+1) +" is at "+newPosition);
           }
        }
    }
}
