import java.util.Scanner;
  public class Exercise06_25{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter time in milliseconds: ");
  long millis = input.nextLong();
  }
  public static String convertMillis(long millis){
  if ((millis % 3600000) != 0){
      long hours = millis/3600000;
      millis = millis%3600000;
  }if((millis%60000) != 0){
      long minutes = millis/60000;
      millis = millis%60000;
  }if(millis != 0){
      long seconds = millis/1000;
  }
  return hours + ":" + minutes + ":" + seconds;
}
}
