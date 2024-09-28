import java.util.Scanner;
import java.util.Random;
public class GuessingNumber {
    public static void main(String[] args) {
        System.out.println("This is Number Guessing Game in which you have to Guess the Number between 1 to 100.");
        System.out.println("You have to play this Game for 3 Rounds and each Round will give you 5 Attempts to Guess the Correct Number.");
        System.out.println( "You have to Win Atleast 2 Round to Win This Game");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int round = 1;
        int Total_round_won = 0;
        while(round<=3){
            int random_num = rd.nextInt(100)+1;
            System.out.println(random_num);
            System.out.println("Round "+round);
            boolean b = true;
            int attempt = 5;
            while(b && attempt>0){
                System.out.println("Guess the Number (Number of Attempts Left = "+attempt+")");
                int guess_num = sc.nextInt();
                if(guess_num>random_num){
                    System.out.println("Lower Number Please");
                    attempt--;
                }else if(guess_num<random_num){
                    System.out.println("Higher Number Please");
                    attempt--;
                }
                else{
                    System.out.println("Congratulation You Guessed the Correct Number in "+ (6-attempt)+" Attempts");
                    b = false;
                }
            }
                if(b==false){
                    System.out.println("You Won Round "+round);
                    Total_round_won+=1;
                }
                else{
                    System.out.println("You Loose This Round");
                }
            round++;
            System.out.println(" ");
        }
        if(Total_round_won>=2){
            System.out.println("Congrats You Won This Game\nYou Won " +Total_round_won+" out of 3 Rounds");
        }
        else{
            System.out.println("You Loose This Game\nYou Won " +Total_round_won+" out of 3 Rounds");
        }
    }
}