import java.util.Scanner;
public class replaceAt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your sentence:");
		String sentence = kb.nextLine();
		replacer(sentence);
	}
	public static void replacer(String sent)
	{
		int num = 0;
		int length = sent.length();
		char a = 'a';
		while(num < length)
		{
			if (sent.charAt(num) == a)
				System.out.print("@");
			else
				System.out.print(sent.charAt(num));
			num++;
		}
	}
}