public class TestPersons
{
	public static void main(String[] args)
	{

		Persons p1=new Persons("shabbi",22);
		//p1.setName("puneet");
		//p1.setAge(21);
		String d=p1.getName();
		System.out.println(d);
		int f=p1.getAge();
		System.out.println(f);
		p1.display();
	}
}