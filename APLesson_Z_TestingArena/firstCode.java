import java.util.Random;
import java.util.ArrayList;
public class firstCode {
	public static void main(String[]args) {
		System.out.println(randomString(-229985452) + " " + randomString(-147909649));
		int[] arrInt = {-2146926310, -1885533740, -274140519, 
                -2145247212, -1845077092, -2143584283,
                -2147483454, -2138225126, -2147375969};

	for(int seed : arrInt){
		System.out.print(randomString(seed) + " ");
	}
	/* ArrayList<String> array1 = new ArrayList<String>();
	array1.add("Brady");
	System.out.println("A1: " + array1);
	ArrayList<String> array2 = array1;
	System.out.println("A2: " + array2);
	array2.add("Hi");
	System.out.println("A1: " + array1); */
	}
	public static String randomString(int i)
	{
		Random ran = new Random(i);
		StringBuilder sb = new StringBuilder();
		while (true)
		{
			int k = ran.nextInt(27);
			if (k == 0)
				break;

			sb.append((char)('`' + k));
		}

		return sb.toString();
	}
}