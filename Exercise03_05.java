import java.util.Scanner;

public class Exercise03_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer for today's day of the week (Sunday is 0, Monday is 1, and Saturday is 6): ");

        int dayOfWeek = input.nextInt();

        if (dayOfWeek > 6 || dayOfWeek < 0) {
            input.close();
        } else {
            System.out.print("Enter the number of days after today to discover the future day: ");
            int numberOfDays = input.nextInt();

            int futureDayOfWeek = (dayOfWeek + numberOfDays) % 7;

            String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println(weekDays[futureDayOfWeek]);
            input.close();


        }


    }

}