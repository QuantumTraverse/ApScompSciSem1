import java.util.Scanner;
public class toyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the Toys:");
		ToyStore object = new ToyStore(kb.nextLine());
		System.out.println(object);
		System.out.println("Most Frequent Toy: " + getMostFrequentToy());
		System.out.println(getMostFrequentType());
	}
}