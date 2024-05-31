package guess_number;

import java.util.Scanner;

/**
 * @author JONATHAN
 *
 */
public class GuessNumber {
	
	public static void guessthenumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess the number");
		
		int number = (int)(Math.random()*100)+1;
		System.out.println("number is "+ number);
		int count = 3;
		int i,guess;
		
		for(i = 0; i < count; i++) {
		
			guess = scan.nextInt();
			
			//if number is chosen right
			if(number == guess) {
				System.out.println("Number is guess right "+number);
				
				break;
			}
			else if(number > guess && i != count-1) {
				System.out.println("oops! number is too low");
				
			}
			else if(number < guess && i != count-1) {
				System.out.println("oops! the number is too high");
			}
			
		}
		
		if(i == count) {
			System.out.println("Failed!! Game Over");
			System.out.println("the number was "+ number);
			
		}
		
	}
	
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			boolean playagain = true;
			guessthenumber();
			while(playagain) {
				
				System.out.println("DO YOU WANT TO CONTINUE. Y/N");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("Y")) {
					guessthenumber();
				}
				else {
					System.exit(1);
					
				}
			}
		}
		
	}
}
