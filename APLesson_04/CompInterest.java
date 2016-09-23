import java.util.Scanner; 

public class CompInterest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		CompInterest math = new CompInterest();
		
		System.out.println("Please enter the intital amount (in $):");
		int prinicipal = kb.nextInt();
		System.out.println("Please enter the interest rate (as a decimal):");
		double interest = kb.nextDouble();
		System.out.println("Please enter the loan duration (in years):");
		int time = kb.nextInt();
		System.out.println("Please enter the times the loan is compounded per year:");
		int compound = kb.nextInt();
		System.out.printf("Your monthly payment is $" + math.loan(prinicipal, interest, time, compound));
	}
	
	public double loan(int p, double r, int t, int n)
	{
		double subtotal = (1+(r/n));
		double semitotal = Math.pow(subtotal, n*t);
		return (semitotal*p/(t*12));
	}
	
}