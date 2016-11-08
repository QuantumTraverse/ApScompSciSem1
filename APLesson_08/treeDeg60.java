import java.util.Scanner;
public class treeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word:"); //Donaudampfschiffahrtsgesellschaftskapitänmützenhalter
		String word = kb.next();
		int start = 0;
		int stop = word.length();
		tree(word, start, stop);
	}
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.println(spacer(word.substring(0, start), stop));
			start++;
			return tree(word, start, stop);
		}
		else
			 return "";
	}
	public static String spacer(String word, int spaces)
	{
			if (word.length() >= spaces)
				return word;
			else
				 return spacer(" " + word, spaces);
	}
}