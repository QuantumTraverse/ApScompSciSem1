import java.util.Scanner; 

public class Lab_03
{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your first name?");
	String first = keyboard.next();
	System.out.println("What is your last name?");
	String last = keyboard.next();
	System.out.println("What is your father's first name?");
	String father = keyboard.next();
	System.out.println("Are you a boy or a girl? (Answer boy or girl)");
	String boy = keyboard.next();
		if(boy.equals("boy"))	{
			System.out.println("Your Russian name would be: " + first + " "+ father +"evich " + last + " OR " + first + " " + father + "ovich " + last);
		} else if(boy.equals("girl")){
			System.out.println("Or if you are a girl: " + first + " "+ father +"evna " + last + " OR " + first + " " + father + "ovna " + last);
		} else {
			System.out.println("Error");
		}
	}
}