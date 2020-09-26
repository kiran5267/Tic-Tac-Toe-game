import java.util.*;
class Tictactoe{
	//UC 1
   void initializeBoard(){
		char[] board={' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
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
   public static void main(String[] args){
      Tictactoe obj=new Tictactoe();
      obj.initializeBoard();
      obj.chooseLetter();
   }
}

