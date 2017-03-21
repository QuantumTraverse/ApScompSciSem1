import java.util.ArrayList;
import java.util.Scanner;
public class satellite
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter yes");
		String run = kb.next();
		if (run.contains("yes"))
		{
		System.out.println("Running...");
		}
		else
		{
			throw new IllegalArgumentException("The String \"" + run + "\" does not contain \"yes\""); //Just testing something
		}
		ArrayList<car> locate = new ArrayList<>();
		double[] honLoc = {5, 6};
		locate.add(new honda(honLoc));
		locate.add(new toyota("8, 9"));
		locate.add(new GMC(3, 8));

		double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (car l : locate)
		{
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
		}

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (car l : locate)
		{
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
		}

        System.out.println(printout);
		
		String printoutdeux = "\n" + "==========================";
		for(car qwerty: locate)
		{
			double one = 1 + Math.random() * 100;
			double two = 1 + Math.random() * 100;
			qwerty.move(one, two);
			printoutdeux += "\nAfter " + qwerty.getID() + " Moved: (" + one + ", " + two + ")";
			printoutdeux += "\nNew Location: (" + getLocation(qwerty.getLoc()) + ")";
		}
		printoutdeux += "\n\nDistance from home...";
		for(car qwerty: locate)
			printoutdeux += "\nDistance for " + qwerty.getID() + ": (" + getDistance(qwerty.getLoc(), home)+ ")";
		System.out.println(printoutdeux);
	}

	public static String getDistance(double[] car, double[] home)
	{
		return String.format("%1$.2f",Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
	}

	public static String getLocation(double[] loc)
	{
       return String.format("%1$.2f, %1$.2f", loc[0], loc[1]);
	}
}