import java.util.Scanner; 

public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side length:");
		double side = kb.nextDouble();
		System.out.printf("The surface area of a cube of side length %.5f is %.5f.", side, calc(side));
	}
	
	public static double calc(double side)
	{
		return 6.0*(side*side);
	}
	
}