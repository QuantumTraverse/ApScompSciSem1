import java.util.Scanner; 

public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		System.out.println("Please enter the widthj:");
		w = kb.nextDouble();
		calc();
		print();
	}
	
	public static void calc()
	{
		perimeter = 2*l+2*w;
	}
	
	public static void print()
	{
		System.out.println("Your perimter is " + perimeter + " ft around.");
	}
	
}