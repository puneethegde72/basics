public class TestCar
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		Car c2=new Car();
		c1.name="laborgini";
		c2.name="konegsera";
		c1.fuel=100;
		c2.fuel=200;
		c1.Start();
		c1.Drive();
		c1.Reverse();
		c2.Start();
		c2.Drive();
		c2.Reverse();
	}
}