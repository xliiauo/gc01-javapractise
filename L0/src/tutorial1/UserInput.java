package tutorial1;

import java.util.Scanner; //cmd + shift + o(Source - Organize Inputs) in eclipse will auto import packages needed

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //create a scanner object

		System.out.println("What is your first name?");
		String name = scanner.nextLine(); //use nextLine() method in scanner pass value to String called name
		
		System.out.println("What is your second name?");
		String name2 = scanner.nextLine();
		scanner.close();
		
		System.out.println("Okay, your name is " + name + " " + name2 + ".");

	}

}
