import java.util.Scanner;

public class chooseAdventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		story();
	}
	public static void story()
	{
		System.out.println("You wake up. It's dark and cold, but wait, something is covering your eyes. Your head hurts. This could a viable threat" +
						   "\nor it could all just be nothing. Do you assume the worst? (Y or N)");
		String choice1 = kb.next();
		if(choice1.equals("Y") || choice1.equals("y"))
		{
			System.out.println("You wave your arms and wiggle frantically, and then realize it was just a pillow. You are also on your bed without any covers," +
							   "\nexplaining why it was so cold. The sounds of contsruction on the house's exterior can be heard in your bedroom even though the" + 
							   "\nwindows are closed and the blinds are shut. The pain is that of a headache now subsiding. Your faithful dog comes up to you" + 
							   "\nand licks yourface, but wait, where is the rest of your family? Do you assume the worst? (Y or N)");
			String choice2 = kb.next();
			if (choice2.equals("Y") || choice2.equals("y"))
			{
				System.out.println("Just as you were about to call out, your wife comes around the corner back into the room. She sits on the covers at the edge of your" +
							       "\nbed. She smiles warmly as she sees you sitting up in bed. She says its nice to see that you've finally awoken from the frightful" +
							       "\nfever you've had for the past week and hands you some coffee, but something feels...artificial. You have this nagging feeling that" +
							       "\nsomething is still off. But it is not anything specific you can put your finger on... Is something wrong? (Y or N)");
				String choice3 = kb.next();
				if (choice3.equals("Y") || choice3.equals("y"))
				{
					System.out.println("Yes! Something is off! There were no covers on your bed just a few moments ago, but now there are. You look to the bedside table and" +
								   	   "\nsee two pills, one red and one blue. Suddenly, you remember a little more. Last night, you were with a man who told you the world was" +
								  	   "\nnot real. He said the red pill would show deep the rabbit hole would go, while with the blue, you would awake the following morning" +
									   "\nwondering if it were all a dream. You took the blue and regret the decision now. You dive for the table and quickly swallow the red" +
									   "\npill. Your wife screams loudly and runs out of the room. You start feeling sick to your stomach. Your wife returns a few minutes later" +
									   "\nwith three men in dark suits and earpieces. You realize it was not the real pill, and there will be no escape this time.");
				}
				else if(choice3.equals("N") || choice3.equals("n"))
				{
					System.out.println("Everything is tickety-boo! \"Its nice to see you to,\" you say, sipping your coffee. As you continue to pet your dog, suddenly you feel a sharp" +
								   	   "\npain in your chest. You clench your torso as your wife looks down helplessly and sorrowfully at you. You fall off the bed and can no longer move" +
								  	   "\n\"Sorry, it was for the best\" she whispers and your vision blurs, as six or seven well-armed thought police, in full SWAT gear, break down the" +
									   "\ndoor with weapons drawn. The spiked coffee has taken its full effect, and your consciousness slips away, cursing Big Brother with your dying breath.");
				}
				else
				{
					System.out.println("Answer properly.");
					story();
				}
			}
				else if(choice2.equals("N") || choice2.equals("n"))
			{
				System.out.println("Best assumed on lack of family" +
							       "\nbed. She smiles warmly as she sees you sitting up in bed. She says its nice to see that you've finally awoken from the frightful" +
							       "\nfever you've had for the past week and hands you some coffee, but something feels...artificial. You have this nagging feeling that" +
							       "\nsomething is still off. But it is not anything specific you can put your finger on... Is something wrong? (Y or N)");
				String choice3 = kb.next();
				if (choice3.equals("Y") || choice3.equals("y"))
				{
					System.out.println("TBD Choice 1" +
								   	   "\nsee two pills, one red and one blue. Suddenly, you remember a little more. Last night, you were with a man who told you the world was" +
								  	   "\nnot real. He said the red pill would show deep the rabbit hole would go, while with the blue, you would awake the following morning" +
									   "\nwondering if it were all a dream. You took the blue and regret the decision now. You dive for the table and quickly swallow the red" +
									   "\npill. Your wife screams loudly and runs out of the room. You start feeling sick to your stomach. Your wife returns a few minutes later" +
									   "\nwith three men in dark suits and earpieces. You realize it was not the real pill, and there will be no escape this time.");
				}
				else if(choice3.equals("N") || choice3.equals("n"))
				{
					System.out.println("TBD Choice 2" +
								   	   "\npain in your chest. You clench your torso as your wife looks down helplessly and sorrowfully at you. You fall off the bed and can no longer move" +
								  	   "\n\"Sorry, it was for the best\" she whispers and your vision blurs, as six or seven well-armed thought police, in full SWAT gear, break down the" +
									   "\ndoor with weapons drawn. The spiked coffee has taken its full effect, and your consciousness slips away, cursing Big Brother with your dying breath.");
				}
				else
				{
					System.out.println("Answer properly.");
					story();
				}
			}
			else
			{
				System.out.println("Answer properly.");
				story();
			}
		}
		else if(choice1.equals("N") || choice1.equals("n"))
		{
			System.out.println("Best assumed on face cover.");
		}
		else
		{
			System.out.println("Answer properly.");
			story();
		}
	}
}