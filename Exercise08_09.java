import java.util.Scanner;
public class Exercise08_09{
public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    System.out.println("Player 1, Whats your name?");
    String p1 = input.nextLine();
    System.out.println("Player 2, Whats your name?");
    String p2 = input.nextLine();
    
    char[][] board = new char [3][3];
    for(int i = 0; i<3; i++) {
    	for(int j=0; j<3; j++) {
    		board[i][j] = '-';
    	}
    }
    boolean isPlayer1 = true;
    boolean gameEnded = false;
    while(!gameEnded) {
    
    char symbol= ' ';
    if(isPlayer1) {
    	symbol = 'x';
    	
    }else {
    	symbol = 'o';
    }
    
    if(isPlayer1) {
    	System.out.println(p1 + "'s Turn(x)");
    }else {
    	System.out.println(p2 + "'s Turn(o)");
    }
    
    
    
    
    int row=0;
    int column=0;
    
    while(true) {
    System.out.print("Enter a row (0, 1, 2): ");
    row = input.nextInt();
    System.out.print("Enter a row (0, 1, 2): ");
    column = input.nextInt();
    
    if(row < 0 || row > 2 || column < 0 || column > 2) {
    	
    	System.out.println("Incorrect values for this game");
    }else if(board[row][column] != '-') {
    	
    	System.out.println("An exisiting move has been made on that spot");
    }else {
    	break;
    }
   }
    
   board[row][column]=symbol;
   drawBoard(board);
    
   if(hasWon(board) == 'x') {
	   System.out.println(p1 + " has won!");
	   gameEnded = true;
   }else if(hasWon(board) == 'o') {
	   System.out.println(p2 + " has won!"); 
	   gameEnded = true;
   }else {
	   if(hasTied(board)) {
		   System.out.println("It's a tie!");  
		   gameEnded = true;
	   }else {
		   isPlayer1 = !isPlayer1;
	   }
	   
   }
} 
 drawBoard(board);   
}
public static void drawBoard(char[][] board) {
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.print(board[i][j]);
		}
		System.out.println();
	}
}

public static char hasWon(char[][] board) {
	for(int i = 0; i < 3; i++) {
		if(board[i][0]== board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
			return board[i][0];
		}
}
	 for(int j = 0; j < 3; j++) {
		 if(board[0][j] == board[1][j] && board[1][j]== board[2][j] && board[0][j] != '-') {
			 return board[0][j];
		 }
	 }
	
	if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
		return board[0][0];
	}
	
	if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
		return board[2][0];
	}
	return '-';
	
}
public static boolean hasTied(char[][] board) {
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			if(board[i][j] == '-') {
				return false;
			}
		}
	}
	return true;
	}
}