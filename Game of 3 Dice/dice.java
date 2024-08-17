import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {

        int numDice = 3, trials = 7;
        int playerPoints = 0, computerPoints = 0;
        Random choice = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your target number: ");
        int playerTarget = scan.nextInt();
        Game player = new Game(numDice, trials);
        playerPoints = player.play("Player", playerTarget);
        int computerTarget = choice,nextInt(7) + 1;
        System.out.println("Computer's target is " + computerTarget);
        Game computer = new Game(numDice, trials);
        computerPoints = computer.play("Computer", computerTarget);
        if(playerPoints > computerPoints) {
            System.out.println("You win");
        }
        else if(playerPoints < computerPoints) {
            System.out.println("Computer wins");
        }
        else System.out.println("Draw");
        scan.close();
    }
}
