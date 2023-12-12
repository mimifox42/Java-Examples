import java.util.Scanner;
public class Exercise03_07 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amountInDouble = in.nextDouble();

        int leftoverAmount = (int) (amountInDouble * 100);

        int numOfOneDollars = leftoverAmount / 100;
        leftoverAmount %= 100;

        int numOfQuarters = leftoverAmount / 25;
        leftoverAmount %= 25;

        int numOfDimes = leftoverAmount / 10;
        leftoverAmount %= 10;

        int numOfNickles = leftoverAmount / 5;
        leftoverAmount %= 5;

        int numOfPennies = leftoverAmount;
       
       if (numOfOneDollars > 1){
       System.out.println("You have " + numOfOneDollars + " dollars");

    }else if(numOfOneDollars == 1){
      System.out.println("You have " + numOfOneDollars + " dollar");
    }else{
      
    }
     if (numOfQuarters > 1){
       System.out.println("You have " + numOfQuarters + " quarters");

    }else if(numOfQuarters == 1){
      System.out.println("You have " + numOfQuarters + " quarter");
    }else{
      
    }
 if (numOfDimes > 1){
       System.out.println("You have " + numOfDimes + " dimes");

    }else if(numOfDimes == 1){
      System.out.println("You have " + numOfDimes + " dime");
    }else{
      
    }
     if (numOfNickles > 1){
       System.out.println("You have " + numOfNickles + " nickels");

    }else if(numOfNickles == 1){
      System.out.println("You have " + numOfNickles + " nickel");
    }else{
      
    }
 if (numOfPennies > 1){
       System.out.println("You have " + numOfPennies + " pennies");

    }else if(numOfPennies == 1){
      System.out.println("You have " + numOfPennies + " penny");
    }else{
      
    }

}

}