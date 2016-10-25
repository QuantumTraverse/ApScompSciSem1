public class song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	public static void sing(String word, int repetition)
	{
		for(int l = 0; l < repetition; l++)
		{
			System.out.print(word + "\t");
		}
		System.out.print("\n");
	}
}