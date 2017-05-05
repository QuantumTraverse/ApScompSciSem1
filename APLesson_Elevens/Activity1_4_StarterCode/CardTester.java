/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card kingKarl = new Card("King", "Spades", 10);
		Card maryAnnoinette = new Card("Queen", "Hearts", 10);
		Card harry = new Card("Six", "Clubs", 6);
		System.out.println(kingKarl);
		System.out.println(maryAnnoinette);
		System.out.println(harry);
	}
}
