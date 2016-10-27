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
				System.out.println("You get out of bed and realize this is not your normal bed. This is the guest bed of your best friend, Lingling. You note that while" +
							       "\nthe dog looks familiar, it is actually Lingling's dog. You follow the dog back to his master, who is staring at Cross Country racing" +
							       "\nrecords at his computer. \"Good morning,\" he says,\"what time did you say you needed to leave to walk to the train station?\" Your" +
								   "\noddly faded memory begins to return. You were here because you had business in the city and Lingling lived right next to the station," +
								   "\nmaking his house extremely convenient. You tell him fifteen minutes, and depart then. As you walk with your luggage across the street, " +
							       "\nyou see something shiny in the nearby gutter. Do you reach down to pick it up? (Y or N)");
				String choice3 = kb.next();
				if (choice3.equals("Y") || choice3.equals("y"))
				{
					System.out.println("As you bend over, you realize it is just the reflection of the water in the gutter. You pretend to tie your shoe to hide your embarressement." +
								   	   "\nJust as you are finishing up, someone says \"Phil? Phil Connors?\" an odd man shouts from a distance.\"It's me! Ned Ryersen!\" The man next to" +
								  	   "\nyou starts to move quickly away from Ned and in the process steps into the puddle. \"Watch out for that first step. It's a doosie,\" says Ned as" +
									   "\nthe man walks off, annoyed. \"Odd,\" you think to yourself as you make your way into the main hall of the train station.");
				}
				else if(choice3.equals("N") || choice3.equals("n"))
				{
					System.out.println("You keep walking and a young boy boy reaches down and picks it up, and walks into the nearby candy story. As you stand, waiting in line to get into" +
								   	   "\nthe train station, the crowd at the nearby newspaper stand makes a large ruckuss. Suddenly, the young boy runs out of the crowd, clutching a small," +
								  	   "\ngolden sheet to his chest. \"Run for it, Charlie! Run straight home and don't stop until you get there.\" someone in crowd shouts. \"That could have been" +
									   "\nme,\" you say to yourself. Oh, well. No sense worrying about it now.");
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
			System.out.println("The more you think about it, the worse it seems. Not just your head, but your entire body hurts. You cannot remember anything" +
							   "\nYou seem to be tied up in a in a metal chair. You wiggle a little and find that the ropes don't feel tight. Do you attempt to" + 
							   "\nescape? (Y or N)");
			String choice2 = kb.next();
			if (choice2.equals("Y") || choice2.equals("y"))
			{
				System.out.println("You wiggle out of your binds with ease. You remove the blindfold from your eyes and find that you are in an underground room or" +
							       "\nbasement of some sort. There are all sorts of boxes and crates in the room. There seem to be two ways out, a long passage down to" +
							       "\nyour right of an elevator on your left. Do you take the elevator? (Y or N)");
				String choice3 = kb.next();
				if (choice3.equals("Y") || choice3.equals("y"))
				{
					System.out.println("You hop in the elevator and push the button for one floor higher. You can't really think of any better plan to start looking for a way" +
								   	   "\nout. Good luck, or is it really? Just one floor up, you find large masses of stormtroopers gathered around an opening blasted into the" +
								  	   "\nstarship. Despite your tattered officer's uniform, your imperial badge allows you on to the starship. Now for the difficult part, to" +
									   "\nsuccessfully hide and get off the ship at its next stop so to avoid Lord Vader's wrath at your failure. You might know a smuggler or two," +
									   "\nwhom you happened to turn a blind eye to, who could help you find a new life.");
				}
				else if(choice3.equals("N") || choice3.equals("n"))
				{
					System.out.println("You walk down the passageway and it begins to feel colder. You come to one of the waterlock doors. You try to open it. \"Darn Captain Nemo! Locking me" +
								   	   "\nand my shipmates in as he does his dastardly deeds...\" you think to yourself, \"but by locking me in the hold rather than my cabin, he has gone too far.\"" +
								  	   "\nYou  begin scheming to work with Ned and Aronnax on something.");
				}
				else
				{
					System.out.println("Answer properly.");
					story();
				}
			}
				else if(choice2.equals("N") || choice2.equals("n"))
			{
				System.out.println("As a human, not an animal, you sit and wait. You will confront your unknown captors and defeat them or you can hope that someone wil come" +
							       "\nto your assisstance, but which will it be? You hear footsteps approaching. Do you call out in hopes that they will help you? (Y or N)");
				String choice3 = kb.next();
				if (choice3.equals("Y") || choice3.equals("y"))
				{
					System.out.println("You begin to make muffled cries and the footsteps quicken. \"I think we've cracked him\" whispers a man to the another. You remember the" +
								   	   "\nsearing pain in your forehead, and you indeed feel like you have been cracked. They lift off the blindfold and you see two men in suits," +
								  	   "\nwho strangely are wearing a wristwatch on each arm. They remove your binds and tell you that they are Agents here to save me from the East" +
									   "\nKoreans. They say that they will provide you with food, home, and work as Helpers as Ledroptha Curtain's Learning Institute for the Very" +
									   "\nEnlightened. Sounds like fun. You attempt to escpae, recognizing their deceit, but they shock you with their wristwatches. \"I don't think" +
									   "\nwe cracked him yet.\" says one of them, as they bring you over to a sinister looking device with a helmet, \"We're gonna have to go through" +
									   "\nthis process again.\" They strap you in and your mind fades into darkness.");
				}
				else if(choice3.equals("N") || choice3.equals("n"))
				{
					System.out.println("You stay perfectly silent. You begin to even supress your breathing. You become hyperconcious of your surrondings. It seems that the ground is" +
								   	   "\nrocking. You might be on a boat. The footsteps stop in front of you. A familiar voice says\"What did you do to Harold this time?\" He lifts the bag" +
								  	   "\noff of your head and you find yourself in the crago hold of a large ship before a cadet. Your memory returns. Last night, you bet big on the football" +
									   "\ngame and lost. Unable to pay your debt to Harold, you were punished to spend the night in the hold tied up to keep your from escaping. It hasn't been" +
									   "\nnight, to say the least, rocking and rolling, getting knocked over by shifting barrels. Probably best not to bet so much next time.");
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
		else
		{
			System.out.println("Answer properly.");
			story();
		}
	}
}