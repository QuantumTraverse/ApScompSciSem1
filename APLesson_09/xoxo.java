import java.util.Random;
public class xoxo
{
	static Random rand = new Random();
	public static void main (String[]args)
	{
	String [][] xAndo = new String [4][4];
	fillArray(xAndo);
	printArray(xAndo);
	}
	public static void fillArray(String[][] xAndo)
	{
		int xAndoGen = 0;
		for(int i =0; i < xAndo.length; i++)
		{
			for(int j =0; j < xAndo.length; j++)
			{
				xAndoGen = rand.nextInt(2);
				if(xAndoGen == 0)
					xAndo [i][j] = "x";
				else if(xAndoGen == 1)
					xAndo [i][j] = "o";
				else System.out.println("Error");
			}
		}
	}
	public static void printArray(String[][] xAndo)
	{
		for(int i =0; i < xAndo.length; i++)
		{
			for(int j =0; j < xAndo.length; j++)
				System.out.print(xAndo[i][j] + "\t");
			System.out.print("\n");
		}
	}
}