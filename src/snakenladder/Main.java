package snakenladder;

public class Main {
    public static void main(String[] args) {

        try{
            Player players[] = new Player[2];
            players[0] = new Player("Shiva", "shivakeerthi0@gmail.com");
            players[1] = new Player("Azad", "azadkeerthi4164@gmail.com");

            Xfactor snakes[] = new Snake[2];
            Snake s1 = new Snake();
            s1.configure(20,3);
            Snake s2 = new Snake();
            s2.configure(40,10);
            snakes[0] = s1;
            snakes[1] = s2;

            Xfactor ladders[] = new Ladder[2];
            Ladder l1 = new Ladder();
            l1.configure(7,70);
            Ladder l2 = new Ladder();
            l2.configure(31,67);
            ladders[0] = l1;
            ladders[1] =l2;


            Dice dice = new Dice(6);
            Board board = new Board(10, snakes, ladders);
            Game game = new Game(board, players, dice);

            game.startGame();


        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
