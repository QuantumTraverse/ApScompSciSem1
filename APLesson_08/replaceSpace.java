import java.util.Scanner;
public class replaceSpace
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your sentence:");
		String sentence = kb.nextLine();
		System.out.println(replacer(sentence));
	}
	public static String replacer(String sent)
	{
		if (sent.indexOf(" ") < 0)
			return sent;
		else
			return replacer(sent.substring(0,sent.indexOf(" ")) + "_" + sent.substring(sent.indexOf(" ")+1));
	}
}