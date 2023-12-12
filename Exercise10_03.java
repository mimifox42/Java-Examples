import java.util.Scanner;
public class Exercise10_03{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    MyInteger test1 = new MyInteger(73);
    MyInteger test2 = new MyInteger(44);
    String output1 = "";
    
    if(test1.isEven()){
      output1 += "even";
    }else if(test1.isOdd()){
      output1 += "odd";
    }else{
      output1 += "prime";
    }
    System.out.println("The result of test1 is " + output1);
    
    String output2 = "";
    if(test2.isEven()){
      output2 += "even";
    }else if(test2.isOdd()){
      output2 += "odd";
    }else{
      output2 += "prime";
    }
    System.out.println("The result of test2 is " + output2);
    System.out.println("Enter a number to test this program with");
    
    String output3 = "";
    int userIn = in.nextInt();
    
    if(test1.equals(userIn)){
      output3 += "equal";
    }else{
      output3 += "not equal";
    }
    System.out.println("The result of test1 and your input is " + output3);
    
    char[] Array1 = {3, 12, 6, 8};
    System.out.println("The total of Array1 " + parseInt(Array1));
    
    System.out.println("Enter a number to test this program with");
    String string2 = in.next();
    System.out.println("string2 has become a int number of " + parseInt(string2));
    in.close();
 }
}