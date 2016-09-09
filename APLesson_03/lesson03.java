import java.util.Scanner; 

public class lesson03
{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How old are you? ");
	int num = keyboard.nextInt();
	System.out.println("Wow! " + num + " is pretty old.");
	System.out.println("Who is your favorite teacher? ");
	String teacher = keyboard.next();
	System.out.println("Wow! " + teacher + " is my favorite too.");
	}
}