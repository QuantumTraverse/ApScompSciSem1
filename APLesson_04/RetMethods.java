import java.util.Scanner; 

public class RetMethods
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		RetMethods avg = new RetMethods();
		
		System.out.println("Please enter the three numbers:");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		double average = avg.calcAvg(n1, n2, n3);
		System.out.printf("The volume of your cube is %10.2f\n", average);
	}
	
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
	
}