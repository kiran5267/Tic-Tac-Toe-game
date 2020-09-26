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
			setLocation();
		}
		else if(board[location]==' '){
			board[location]=userChoice;
			showBoard();
		}
		else{
			System.out.println("location assigned already");
		}
	}
	//UC 5
	void nextMove(){
		for(int i=1;i<10;i++){
			if(board[i]==' '){
				setLocation();
				break;
			}
		}
	}
	//UC 6
	void firstMove(){
		int toss=(int)(Math.floor(Math.random()*10)%2);
		System.out.println("Enter 0 for tails or 1 for heads");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(toss==choice){
			System.out.println("user Starts first");
		}
		else{
			System.out.println("Computer starts first");
		}
	}
	public static void main(String[] args){
		Tictactoe obj1=new Tictactoe();
		obj1.initializeBoard();
		obj1.chooseLetter();
		obj1.showBoard();
		obj1.setLocation();
		obj1.nextMove();
		obj1.firstMove();
   }
}

