import java.util.Scanner; 

public class SubBox
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		SubBox math = new SubBox();
		
		System.out.println("Please enter the height (in inches):");
		double height = kb.nextDouble();
		System.out.println("Please enter the width (in inches):");
		double width = kb.nextDouble();
		System.out.println("Please enter the length (in inches):");
		double length = kb.nextDouble();
		System.out.printf("Your maximum subwoofer size is %8.5f cubic feet.", math.calcVol(height, width, length));
	}
	
	public double calcVol(double h, double w, double l)
	{
		return (h*w*l/1728.0);
	}
	
}