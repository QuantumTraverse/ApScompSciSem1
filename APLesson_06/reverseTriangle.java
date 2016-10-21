import java.util.Scanner;

public class reverseTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word:"); //Donaudampfschiffahrtsgesellschaftskapitänmützenhalter
		String word = kb.next();
		int length = word.length();
		for(int l = length; l >= 0; l--)
		{
			System.out.println(word.substring(0,l));
		}
	}
}