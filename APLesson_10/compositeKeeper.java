import java.util.ArrayList;
import java.util.Arrays;

public class compositeKeeper
{
	public static void main (String[]args)
	{
		Integer[] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		
		ArrayList<Integer>collection = new ArrayList<>(Arrays.asList(numbers));
		
		primeRemover(collection);
		System.out.println(collection);
	}
	public static int gFactor(int n)
	{
		int i =2;
		while(i < n)
		{
			if(n%i == 0)
			{
				return 1;
			}
			i++;
		}
		return 0;
	}
	public static void primeRemover (ArrayList<Integer>collection)
	{
		int i =0;
		while(i < collection.size())
		{
			if(gFactor(collection.get(i)) == 0)
				collection.remove(i);
			else
				i++;
		}
	}
}