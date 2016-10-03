import java.util.Scanner; 

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius:");
		r = kb.nextDouble();
		calc();
		print();
	}
	
	public static void calc()
	{
		area = r*r*3.14159;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle %.5f in radius is %.5f.", r, area);
	}
	
}