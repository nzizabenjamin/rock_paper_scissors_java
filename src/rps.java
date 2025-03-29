import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String personMove;

            while (true) {
                System.out.println("Please enter the move you would like to play");
                personMove = sc.nextLine();
                if (personMove.equals("r") || personMove.equals("p") || personMove.equals("s")) {
                    break;
                }
                System.out.println("Please enter valid move you would like to play[r,p,s]");
            }
            System.out.println("The computer move is " + computerMove);

            if (personMove.equals(computerMove)) {
                System.out.println("It's a tie");
            } else if (personMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose buddy!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win!!");
                }
            } else if (personMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You lose buddy!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You win!!");
                }
            } else if (personMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You lose buddy!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win!!");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }

    }
}
