import java.util.Scanner;
import java.util.Random;

public class diceGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		int human = 1+rand.nextInt(6);
		System.out.println("You rolled a " + human);
		int computer = 1+rand.nextInt(6);
		System.out.println("The Computer rolled a " + computer);
		System.out.println(compare(human, computer));
	}
	public static String compare(int h, int c)
	{
		if(h > c)
			return "You won!";
		if(h < c)
			return "The computer wins!";
		else
			return "No one won... :(";
	}
}