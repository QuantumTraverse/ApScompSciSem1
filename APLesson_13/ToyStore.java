import java.util.ArrayList; //https://www.youtube.com/watch?v=ODeNHRtVNO4
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
		String[] toys = list.split(", ");
		
		for(int i =0; i < toys.length; i+=2)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy t = getThatToy(name);
			if(t == null)//if t is not on the list...
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));//add a new car to toyList
				if(type.equals("AF"))
					toyList.add(new Afigure(name));
			}
			else 
				t.setCount(t.getCount()+1);
		}
	}
	public Toy getThatToy(String name)
	{
		for(Toy t : toyList) //checking each Toy
		{
			if(t.getName().equals(name))//if it's on the list...
				return t; //return it
		}
		return null; //return null otherwise
	}
	
	public String getMostFrequentToy()
	{
		String name;
		int max = 0;
		for(Toy toy : toyList)
		{
			if(max < Toy.getCount())
			{
				max = Toy.getCount();
				name = Toy.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy toy : toyList)
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