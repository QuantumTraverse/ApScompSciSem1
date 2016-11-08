import java.util.Scanner;
public class wordCenterer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first word:");
		String word1 = kb.next();
		System.out.println("Please enter your second word:");
		String word2 = kb.next();
		System.out.println("Please enter your third word:");
		String word3 = kb.next();
		System.out.println(recurCenterer(word1));
		System.out.println(recurCenterer(word2));
		System.out.println(recurCenterer(word3));
	}
	public static String recurCenterer(String word)
	{
			if (word.length() >= 20)
				return word;
			else
				 return recurCenterer(" " + word + " ");
	}
}