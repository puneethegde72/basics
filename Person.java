public class Person
{
	int age;
	String name;
	public void eat()
	{
		if(age>=40)
		System.out.println("Person "+name+" eat more");
		else
		System.out.println("person "+name+" eat less");
	}
	public void sleep()
	{
		if(age<40)
		System.out.println("person "+name+" sleep more");
		else
		System.out.println("person "+name+" sleep less");
	}
}