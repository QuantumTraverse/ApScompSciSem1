import java.util.Scanner;
public class gunGame
{
	static Scanner kb = new Scanner(System.in);
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String [] clip;
	public static void main (String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
		resetClip();
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String response = kb.next();
			if (response.equals("R"))
				reload();
			if (response.equals("S"))
				System.out.println(shoot());
			printClip();
		}
		System.out.println("Out of Bullets");
	}
	public static void resetClip()
	{
		for(int i =0; i < clipSize; i++)
			clip[i] = "[]";
	}
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount-1] = " []";
			shotCount--;
			return "Bang!";
		}
		else
			return "Reload!";
	}
	public static void reload()
	{
		if (bulletCount >= clipSize)
		{
			bulletCount -= clipSize;
			shotCount = clipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i =0; i < shotCount; i++)
			clip[i] = " * ";
	}
	public static void printClip()
	{
		String output = "Bullets:\t" + bulletCount + "\nClip:\t";
		for(int i =0; i < clipSize; i++)
			output= output + clip[i];
		System.out.println(output);
	}
}