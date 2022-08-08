import java.util.Scanner;

class Guesser {
	
	
	int guessNum;
	public int guessedNum() {
		System.out.println("Kindly pick up the 'Gaming' number between 1 to 10");//Gaming number is the number which has to be guessed by the players!!
		Scanner sc = new Scanner(System.in);
		guessNum=sc.nextInt();
//		sc.close();
		
		
		return guessNum;
	}
	
	

}
class Players {
	
	int guessNum;
	static int i=1;
	public int guessedNum() {
		
		System.out.println("Player "+i+" guess the number");
		Scanner sc= new Scanner(System.in);
		guessNum=sc.nextInt();
//		sc.close();
		i++;
		
		return guessNum;
	}
	
	
}


class TakeDecesion{
	
	public void takeurdecesion() {
	
	while(true) {
		Scanner sc = new Scanner(System.in);
			int decesion=sc.nextInt();
			switch(decesion) {
			case 1:
			Players p = new Players();
			p.i=1;
			Umpire u = new Umpire();
			u.guessedf();
			u.pGuessed();
			u.compare();
			
			break;
			
			case 0:System.out.println("Thanks for playing the game..see u again!");
			System.exit(0);
			
			default:
				System.out.println("Plz take valid decesion!");
//				continu=sc.nextInt();
				continue;
					
			}
	}
	}

}

class Umpire {
	int guessed;
	int tieGuessed;
	int p1Guessed;
	int p2Guessed;
	int p3Guessed;
	
	public void guessedf() {
		Guesser g= new Guesser();
		guessed=g.guessedNum();
		if(guessed>10||guessed<1) {
			System.out.println("'Gaming' number must be between 1 to 10...Try once again!!");
			Umpire u = new Umpire();
			u.guessedf();
			u.pGuessed();
			u.compare();

		}
	}
	
	public void pGuessed() {
	Players p1 = new Players();
	Players p2 = new Players();
	Players p3 = new Players();
	
	p1Guessed=p1.guessedNum();
	p2Guessed=p2.guessedNum();
	p3Guessed=p3.guessedNum();
	}
	
	
	
	public void compare() {
		
		if(guessed==p1Guessed) {
			if(guessed==p2Guessed && guessed==p3Guessed) {
				System.out.println("Game tied! Press 1 to play again, Press 0 to exit");
//				int decesion=1;
				
			TakeDecesion newdec= new TakeDecesion();
			newdec.takeurdecesion();

					
			
				
			}
			
			else if(guessed==p2Guessed) {
				System.out.println("player 1 and player 2 are winners..press 1 to continue,press 0 to exit game! ");
				TakeDecesion newdec= new TakeDecesion();
				newdec.takeurdecesion();

				
			}
			
			else if(guessed==p3Guessed) {
				System.out.println("player 1 and player 3 are the winners..press 1 to continue,press 0 to exit game!");
				TakeDecesion newdec= new TakeDecesion();
				newdec.takeurdecesion();

			}
			
			else {
				System.out.println("player 1 is winner. press 1 to continue,press 0 to exit game!");
				TakeDecesion newdec= new TakeDecesion();
				newdec.takeurdecesion();

			
			}
			
		}
		
		else if(guessed==p2Guessed) {
			if(guessed==p3Guessed) {
				System.out.println("player 2 and player 3 are winners..press 1 to continue,press 0 to exit game!");
				TakeDecesion newdec= new TakeDecesion();
				newdec.takeurdecesion();

			}
			
			else {
				System.out.println("player 2 is winner..press 1 to continue,press 0 to exit game!");
				TakeDecesion newdec= new TakeDecesion();
				newdec.takeurdecesion();

			}
		}
		
		else if(guessed==p3Guessed){
			System.out.println("player 3 is winner..press 1 to continue,press 0 to exit game!");
			TakeDecesion newdec= new TakeDecesion();
			newdec.takeurdecesion();

		}
		
		else {
			System.out.println("Game lost! Please try again.press 1 to continue,press 0 to exit game! ");
			TakeDecesion newdec= new TakeDecesion();
			newdec.takeurdecesion();

			
		}
	}


}



public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Umpire u = new Umpire();
		u.guessedf();
		u.pGuessed();
		u.compare();

	}

}

