import java.util.Scanner;
public class Exercise05_01{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double total, val,totalVal = 0, posCount=0, negCount=0;
      val = input.nextDouble();
       while(val != 0){
           if(val < 0){
               negCount ++;
           }else{
               posCount++;
           }
           totalVal += val;
        }
       System.out.println("Total positive numbers are " + posCount);
       System.out.println("Total negative numbers are "+ negCount);
       System.out.println("Total of the number is" + totalVal);
       System.out.println("Average is " + ((totalVal * 1.0)/(posCount+negCount))); 
    }
}