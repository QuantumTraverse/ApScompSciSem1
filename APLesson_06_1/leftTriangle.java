import java.util.Scanner;

public class leftTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word:"); //Donaudampfschiffahrtsgesellschaftskapitänmützenhalter
		String word = kb.next();
		int length = word.length();
		for(int l = 0; l <= length; l++)
		{
			System.out.println(word.substring(l,length));
		}
	}
}