import java.util.Scanner; 

public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length:");
		double length = kb.nextDouble();
		System.out.println("Please enter the width:");
		double width = kb.nextDouble();
		System.out.printf("Your rectangle is %.5f ft around.", calc(length, width));
	}
	
	public static double calc(double l, double w)
	{
		return 2.0*l+2.0*w;
	}
	
}