import java.lang.*;
import java.util.*;
class Tictactoe{
	char[] board=new char[10];
	char userChoice,comChoice;
	//UC 1
	void initializeBoard(){
		for(int i=0;i<10;i++){
			board[i]=' ';
		}
	}
	//UC 2
	void chooseLetter(){
		System.out.println(" Choose a letter X or O");
		Scanner sc=new Scanner(System.in);
		userChoice=sc.next().charAt(0);
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
	//UC 4
	void setLocation(){
		System.out.println("Enter the location");
		Scanner sc=new Scanner(System.in);
		int location=sc.nextInt();
		if(location>9 || location ==0){
			System.out.println("Enter valid location");
		}
		else if(board[location]==' '){
			board[location]=userChoice;
			showBoard();
		}
		else{
			System.out.println("location assigned already");
		}
	}


	public static void main(String[] args){
		Tictactoe obj1=new Tictactoe();
		obj1.initializeBoard();
		obj1.chooseLetter();
		obj1.showBoard();
		obj1.setLocation();
   }
}

