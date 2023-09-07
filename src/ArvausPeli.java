import java.util.Scanner;
public class ArvausPeli {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String   answer;
		answer="terhi"; 
		int guess;
		guess=0;
		
		
		System.out.println("Guess my name.");
		do {
			guess++;
			answer = in.nextLine();
			answer = answer.toLowerCase();
			
			if(answer.equals("terhi")){
				System.out.println("You are right!");
				System.out.println("You guessed "+guess+" times");
				break;}
			
			if(!answer.equals("terhi")) {
				System.out.println("You are wrong!Guess again? y/n?");}
			    answer=in.nextLine();
			
			if(answer.equals("y")) {
				System.out.println("Guess again");
			}
			    
			if (answer.equals("n")) {
				System.out.println("Thanks bye");
				break;
			}
		
		}while (true);

		
		
		

		

		
		
		
		

		}

}
