// This is a game for rock paper and scissors
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            String[] rps = {"rock", "paper", "scissors"};
            String computerMove = rps[random.nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (rock, paper, or scissors):");
                playerMove = scanner.nextLine().toLowerCase();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println("Invalid move. Please try again.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            }
            else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You win!");
                }
            }
            else if (playerMove.equals("paper")) {
                if (computerMove.equals("scissors")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("rock")) {
                    System.out.println("You win!");
                }
            }
            else if (playerMove.equals("scissors")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("paper")) {
                    System.out.println("You win!");
                }
            }

            System.out.println("Play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}