import java.util.Scanner;

public class GPACalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Make sure your grades are actual grade letters.");
		System.out.println("Enter your Math grade:");
		String math = kb.next();
		System.out.println("Enter your Science grade:");
		String science = kb.next();
		System.out.println("Enter your English grade:");
		String english = kb.next();
		System.out.println("Enter your History grade:");
		String history = kb.next();
		System.out.println("Enter your Language grade:");
		String language = kb.next();
		System.out.println("Enter your CompSci grade:");
		String compsci = kb.next();
		System.out.println("Enter your other Elective grade:");
		String elective = kb.next();
		double GPA = (calcPoints(math)+calcPoints(science)+calcPoints(english)+calcPoints(history)+calcPoints(language)+calcPoints(compsci)+calcPoints(elective))/7.0;
		System.out.printf("Your GPA is %.3f",GPA);
	}
	public static int calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4;
		else if(grade.equals("a"))
			return 4;
		else if(grade.equals("B"))
			return 3;
		else if(grade.equals("b"))
			return 3;
		else if(grade.equals("C"))
			return 2;
		else if(grade.equals("d"))
			return 2;
		else if(grade.equals("D"))
			return 1;
		else if(grade.equals("d"))
			return 1;
		else if(grade.equals("F"))
			return 0;
		else if(grade.equals("f"))
			return 0;
		else
		{
			System.out.println("Technical Difficulties encountered.");
			return 0;
		}
	}
}