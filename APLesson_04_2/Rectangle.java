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
		System.out.println("Please enter the width:");
		w = kb.nextDouble();
		calc();
		print();
	}
	
	public static void calc()
	{
		perimeter = 2.0*l+2.0*w;
	}
	
	public static void print()
	{
		System.out.printf("Your perimter is %.5f ft around.",perimeter);
	}
	
}