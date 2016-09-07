public class Lab_02
{
	public static void main(String[]args)
	{
		//Multiplication
		int n1 = 8;
		int n2 = 5;
		int product = n1 * n2;
		System.out.println("The product of " + n1 + " and " + n2 + " is " + product);
		
		//Concatenation
		String name = "Garry Thornton";
		int nhouse = 3710;
		String street = "Del Mar Heights Rd";
		String city = "San Diego";
		String state = "CA";
		int zipCode = 92130;
		System.out.println(name);
		System.out.println(nhouse + " " + street);
		System.out.println(city + ", " + state + " " + zipCode);
		
		//Complex Calculation
		int length = 8;
		int width = 5;
		int height = 12;
		int area = length * width * 2 + width * height * 2 + length * height * 2;
		System.out.println("The surface area of your rectangle is " + area);
	}
	
}