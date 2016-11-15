import java.util.Scanner;
public class firstLetter
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words: ");
		
		for(int i =0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
		first(names);
	}
	public static void first(String[] names)
	{
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i].charAt(0) + " ");
		}
	}
}