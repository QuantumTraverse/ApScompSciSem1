import java.util.Scanner; 

public class Circle
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius:");
		double r = kb.nextDouble();
		System.out.printf("The area of a circle %.5f in radius is %.5f.", r, calc(r));
	}
	
	public static double calc(double r)
	{
		return r*r*3.14159;
	}

}