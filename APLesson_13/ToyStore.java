import java.util.ArrayList;
import java.util.Scanner;
public class ToyStore
{
	private ArrayList<Toy> toyList;
	public ToyStore()
	{
		System.out.println("Why would you even do this?");
	}
	public ToyStore(String list)
	{
		this.loadToys(list);
	}
	public void loadToys(String list)
	{
		ArrayList<String> toys;
		
		for(int i =0; i < toys.size; i++)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy object = new Toy(getThatToy(name));
			if(object.equals("null"))
				toyList.add(name);
			else count++;
		}
	}
	public void getThatToy(String name)
	{
		for(toyList : toy)
		{
			if(toy.equals(name))
				return toy;
			else
				return "null";
		}
	}
	public String getMostFrequentToy()
	{
		String name;
		int max = 0;
		for(toyList : Toy)
		{
			if(max < Toy.length())
			{
				max = Toy.length();
				name = Toy.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(toyList : Toy)
		{
			if(Toy.getType().equals("Car"))
				cars++;
			if(Toy.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(cars < figures)
			return "Action Figures";
		else
			return "Equal amounts";
	}
	public String toString()
	{
		return toyList;
	}
}