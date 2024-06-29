import java.util.*;

public class NumberGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("              NUMBER GUESSING GAME \n");
        System.out.println("You have 8 chances! \n");

        while (playAgain) 
        {
            int randomNum = random.nextInt(100) + 1;
            roundsPlayed++;

            for (int i=1; i<=8; i++) 
            {
                System.out.print("Guess the number: ");
                int num = sc.nextInt();

                if (num < randomNum) 
                {
                    System.out.println("The number is too low");
                } 
                else if (num > randomNum) 
                {
                    System.out.println("The number is too high");
                }
                else if (num == randomNum) 
                {
                    System.out.println("Correct! You guessed it! \n");
                    roundsWon++;
                    break; 
                }

                if (i == 8) 
                {
                    System.out.println("Sorry, you ran out of chances. The correct number was " + randomNum + "\n");
                }
            }

            System.out.print("Would you like to play again? (yes/no): ");
            sc.nextLine(); 
            String ans = sc.nextLine();
         
            switch (ans.toLowerCase())
            {
                case "yes":
                    playAgain = true;
                    break;
                default:
                    playAgain = false;
                    break;
            }
        }

        System.out.println("\n===== GAME OVER =====");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Thankyou for playing!");
    }
}
