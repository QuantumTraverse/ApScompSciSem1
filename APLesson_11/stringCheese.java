import java.util.Scanner;
public class stringCheese
{
	static Scanner kb = new Scanner(System.in);
	public static void main (String[]args)
	{
	String [][] words = new String [4][4];
	fillArray(words);
	printArray(words);
	}
	public static void fillArray(String[][] words)
	{
		for(int i =0; i < words.length; i++)
		{
			for(int j =0; j < words.length; j++)
			{
				System.out.println("Please enter a word: ");
				words [i][j] = kb.next();
			}
		}
	}
	public static void printArray(String[][] words)
	{
		for(int i =0; i < words.length; i++)
		{
			for(int j =0; j < words.length; j++)
				System.out.print(words[i][j] + " ");
			System.out.print("\n");
		}
	}
}