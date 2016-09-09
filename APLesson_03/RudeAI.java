import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Salutations! My name is AnnoyingLittleKid");
		System.out.println("I'm bored so I'm just gonna pester you with some questions.");
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("Okay, then smelly " + name + ".");
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println("At " + age + ", you still have a few weeks left in you.");
		keyboard.nextLine();
		System.out.println("What do you do for fun?");
		String fun = keyboard.nextLine();
		System.out.println(fun + " is for human grabage cans.");
		System.out.println("What kind of music do you listen to?");
		String music = keyboard.nextLine();
		System.out.println(music + "! Only neadrathals would listen to that.");
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println("With " + siblings + " siblings, are they all as stupid as you?");
		System.out.println("Don't bother answering that. It's called a rhetorical question, dummy.");
		keyboard.nextLine();
		System.out.println("What do you do want to grow up to be?");
		String grow = keyboard.nextLine();
		System.out.println(grow + "! You have a better chance ending up as at McDonalds.");
		
	}
}