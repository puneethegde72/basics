public class Car
{
	String name;
	int fuel;
	boolean isStarted;
	public void Start()
	{
		if(fuel>0)
		{
			isStarted=true;
			System.out.println("engine is started");
		}
		else
		{
			System.out.println("no fuel");
		}
	}
	public void Drive()
	{
		if(isStarted)
		{
			if(fuel>0)
			{
				System.out.println("car is running");
				fuel--;
			}
			else
			{
			Stop();
			}
		}
	}
	public void Reverse()
	{
		Drive();
	}
	public void Stop()
	{
		isStarted=false;
		System.out.println("fuel is empty");
	}
}
