import java.util.Scanner;
import java.util.Random;

public class Exercise03_17 {

    public static void main(String[] args) {

        final int scissor = 0;
        final int rock = 1;
        final int paper = 2;

        Scanner userGameInput = new Scanner(System.in);
        Random random = new Random();

        int userGame = userGameInput.nextInt();

        if (userGame == 0 || userGame == 1 || userGame == 2) {

            int computersPick = random.nextInt(3);
            switch (userGame) {
                case 0:
                    if (computersPick  == scissor) {
                        System.out.println("It is a draw");
                    } else if (computersPick  == rock) {
                        System.out.println("You lost"); 
                    } else if (computersPick  == paper) {
                        System.out.println("You won!"); 
                    }
                    break;
                case 1:
                    if (computersPick  == scissor) {
                        System.out.println("You Won!");
                    } else if (computersPick  == rock) {
                        System.out.println("It is a draw"); 
                    } else if (computersPick  == paper) {
                       System.out.println("You lost");
                    }
                    break;
                case 2:
                    if (computersPick  == scissor) {
                        System.out.println("You lost"); 
                    } else if (computersPick  == rock) {
                        System.out.println("You won!");
                    } else if (computersPick  == paper) {
                        System.out.println("It is a draw");
                    }
                    break;

            }

        } else {
            System.out.println("Input error");
        }

    }

}