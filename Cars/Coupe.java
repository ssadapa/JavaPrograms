package Cars;

public class Coupe {
	
	public String name;
	public boolean isOn;
	
	
	public void printCar()
	{
		
		System.out.println(name);
	}

	public void printCar(int carprice)
	{
		int tax = 100;
		carprice = carprice + tax ;
		System.out.println(carprice);
	}

	public String getCarName()
	{
		return name;
	}


}
