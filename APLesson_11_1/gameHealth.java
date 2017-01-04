import java.util.Scanner;
import java.util.Random;
public class gameHealth
{
	static Random rand = new Random();
	static Scanner kb = new Scanner(System.in);
	static int healthCount;
	static int healthLoad = 6;
	static String [] health;
	public static void main (String[]args)
	{
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[healthLoad];
		
		while(!(turn.equals("Q"))&& healthCount > 0)
		{
			System.out.println("Your Turn. Hit Enter when Ready: ");
			turn = kb.next();
			damage = 1 + rand.nextInt(2);
			amount = 1 + rand.nextInt(6);
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		if(turn.equals("Q"))
			System.out.println("Game ended :(");
		else
			System.out.println("You died... :(");
	}
	public static String takeDamage(int dmg, int amnt)
	{
		if (dmg ==1)
		{
			healthCount -= amnt;
			return "Taking " + amnt + " damage!";
		}
		else
		{
			if (healthCount + amnt < healthLoad)
				healthCount += amnt;
			else
				healthCount = healthLoad;
		}
		return "Power up " + amnt + "!";
	}
	public static void printClip()
	{
		String output = "Health: \t";
		for(int i=0; i < healthLoad; i ++)
		{
			if (i < healthCount)
				health[i] = " @ ";
			else
				health[i] = " []";
			output = output + health[i];
		}
		System.out.println(output);
	}
}