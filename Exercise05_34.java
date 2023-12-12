import java.util.Scanner;
import java.util.Random;

public class Exercise05_34 {

    public static void main(String[] args) {

        final int scissor = 0;
        final int rock = 1;
        final int paper = 2;
        int compWins = 0;
        int userWins = 0;
        int compWinstotal =0;
        int userWinstotal = 0;
        Scanner userGameInput = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 2");
        Random random = new Random();

        int userGame = userGameInput.nextInt();
        while(compWinstotal <= 2 || userWinstotal <= 2){

        if (userGame == 0 || userGame == 1 || userGame == 2) {

            int computersPick = random.nextInt(3);
            switch (userGame) {
                case 0:
                    if (computersPick  == scissor) {
                        System.out.println("It is a draw");
                    } else if (computersPick  == rock) {
                        System.out.println("You lost"); 
                        compWins++;
                        compWinstotal = compWinstotal + compWins; 
                    } else if (computersPick  == paper) {
                        System.out.println("You won!"); 
                        userWins++;
                        userWinstotal = userWinstotal + userWins;
                    }
                    break;
                case 1:
                    if (computersPick  == scissor) {
                        System.out.println("You Won!");
                        userWins++;
                        userWinstotal = userWinstotal + userWins;
                    } else if (computersPick  == rock) {
                        System.out.println("It is a draw"); 
                    } else if (computersPick  == paper) {
                       System.out.println("You lost");
                       compWins++;
                       compWinstotal = compWinstotal + compWins; 
                    }
                    break;
                case 2:
                    if (computersPick  == scissor) {
                        System.out.println("You lost"); 
                        compWins++;
                        compWinstotal = compWinstotal + compWins; 
                    } else if (computersPick  == rock) {
                        System.out.println("You won!");
                        userWins++;
                        userWinstotal = userWinstotal + userWins;
                    } else if (computersPick  == paper) {
                        System.out.println("It is a draw");
                    }
                    break;

            }

        } else {
            System.out.println("Input error");
        }
}if(compWinstotal == userWinstotal){
  System.out.println("Its a draw");
}else if(compWinstotal == 2){
  System.out.println("Computer Wins");
}
else{
  System.out.println("User wins");
}
    }

}