import java.util.Scanner;
public class ArvausPeli {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String answer;
		answer="Terhi";
		
		System.out.println("Guess my name.");
		do {
			
			answer = in.nextLine();
			if(!answer.equals("Terhi")) {
				System.out.println("You are wrong!Guess again!");
			}
			else{
				System.out.println("You are right!");
			}
		}while (!answer.equals("Terhi"));
		

		

		
		
		
		

		}

}
