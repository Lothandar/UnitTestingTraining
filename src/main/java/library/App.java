package library;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		final int trueAnswersAboutLifeDeathAndEverything = 42;
		System.out.println("Welcome to your interactive library software");
		
		System.out.println("Setting Up");
		
		System.out.println("Booting");
		
		System.out.println("Completed");
		
		
		
		while(trueAnswersAboutLifeDeathAndEverything == 42)
		{
			lib.run();
		}
	}
	public static Scanner scan = new Scanner(System.in);
}
