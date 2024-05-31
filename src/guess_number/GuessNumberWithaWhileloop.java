package guess_number;

import java.util.Scanner;

/**
 * @author JONATHAN
 *
 */
public class GuessNumberWithaWhileloop {

	
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			boolean right = false;
			int count = 3;
			 int i;
			 int number = (int)(Math.random()*100)+1;
			 System.out.println("the number "+number);
			 while(!right) {
				
				 System.out.println("Guess the number between 1 and 100");
					int guess = scan.nextInt();
					
					if(number > guess) {
						System.out.println("oops! the number is too low");
					}
					else if(number < guess) {
						System.out.println("oops! the number is too high");
					}
					else{
						System.out.println("you have guessed the number is                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       "+ number);
						break;
					}
				 }
			 }
		}
	}

