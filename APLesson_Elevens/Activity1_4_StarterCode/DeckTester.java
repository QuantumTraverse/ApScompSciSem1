/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"jack", "queen", "king", "ace"};
		String[] ranks2 = {"eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits1 = {"blue", "red"};
		String[] suits2 = {"cats", "cubes"};
		int[] pointValues1 = {10, 10, 10, 11};
		int[] pointValues2 = {8, 9, 10, 11, 12, 13};
		Deck thurston = new Deck(ranks1, suits1, pointValues1);
		Deck howell = new Deck(ranks2, suits1, pointValues2);
		Deck iii = new Deck(ranks1, suits2, pointValues1);
		System.out.println(thurston);
		System.out.println(thurston.isEmpty());
		System.out.println(thurston.deal());
		thurston.shuffle();
		System.out.println(howell);
		System.out.println(howell);
		System.out.println(iii);
		System.out.println(iii.isEmpty());
	}
}
