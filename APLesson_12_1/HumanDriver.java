import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hair:");
		String hair = kb.next();
		System.out.println("Please enter the eyes:");
		String eyes = kb.next();
		System.out.println("Please enter the skin:");
		String skin = kb.next();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());

		System.out.println("Please enter the hair:");
		hair = kb.next();
		System.out.println("Please enter the eyes:");
		eyes = kb.next();
		System.out.println("Please enter the skin:");
		skin = kb.next();
		object.setValues(hair, eyes, skin);
		System.out.println("Friend's info...");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	}
}