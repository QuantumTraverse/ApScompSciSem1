import java.util.Scanner;
public class toyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the Toys:");
		ToyStore store = new ToyStore(kb.nextLine());
		System.out.println(store);
		System.out.println("Most Frequent Toy: " + store.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + store.getMostFrequentType());
	}
}