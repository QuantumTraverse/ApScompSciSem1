import java.util.Scanner; 

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side length:");
		side = kb.nextDouble();
		calc();
		print();
	}
	
	public static void calc()
	{
		sa = 6.0*(side*side);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube of side length %.5f is %.5f.", side, sa);
	}
	
}