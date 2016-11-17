import java.util.Scanner;
public class findZ
{
	static String [] words;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		printArray();
		System.out.print("\n" + containsZ() + " contain the letter \"z\".");
	}
	public static void fillArray()
	{
		System.out.println("Please enter five words: ");
		for(int i =0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		System.out.print("For the following words... ");
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	public static String containsZ()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs = zs + " " + word;
			}
		}
		if(zs.equals(""))
			return "None";
		else
			return "Only" + zs;
	}
}