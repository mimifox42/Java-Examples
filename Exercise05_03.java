int evenNum = 0;
int oddNum = 0;
int evenTotal = 0;
int oddTotal = 0;
int in = stdin.nextInt();  

while(in>0){
    if((in % 2) ==0){
        evenTotal++;
        evenNum += in;
    }else{
        evenTotal++;
        oddNum += in;
}
 in = stdin.nextInt();   
}
System.out.println("the sum of all the even integers read " +evenNum);
System.out.println("the sum of all the odd integers read " +oddNum);
System.out.println("a count of the number of even integers read " + evenTotal);
System.out.println("a count of the number of odd integers read " + oddTotal);