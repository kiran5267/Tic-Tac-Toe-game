import java.util.*;
class Tictactoe{
	//UC 1
	char[] board=new char[10];
   void initializeBoard(){
		for(int i=0;i<10;i++){
			board[i]=' ';
		}
	}
	//UC 2
	void chooseLetter(){
		System.out.println(" Choose a letter X or O");
		Scanner sc=new Scanner(System.in);
		char comChoice;
		char userChoice=sc.next().charAt(0);
		if(userChoice=='X'){
			comChoice='O';
		}
		else{
			comChoice='X';
		}
		System.out.println("User Choise = "+userChoice+" Cumputer Choice= "+comChoice);
	}
	//UC 3
	void showBoard(){
		System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println("-----");
      System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
      System.out.println("-----");
      System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
	}


   public static void main(String[] args){
      Tictactoe obj1=new Tictactoe();
      obj1.initializeBoard();
      obj1.chooseLetter();
		obj1.showBoard();
   }
}

