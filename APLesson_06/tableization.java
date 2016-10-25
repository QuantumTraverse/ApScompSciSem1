import java.util.Scanner;

public class tableization
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Insert your factor");
		int factor = kb.nextInt();
		System.out.println("Insert your table size");
		int tablesize = kb.nextInt();
		int output;
		System.out.printf("%-8s %8s\n","Number","Output");
		for(int i = 1; i <= tablesize; i++)
		{
			output = i*factor;
			System.out.printf("%-8d %8d\n",i,output);
		}
	}
}