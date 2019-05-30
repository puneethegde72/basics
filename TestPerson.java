public class TestPerson
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		p1.age=32;
		p1.name="vivek";
		p2.age=46;
		p2.name="shabbi";
		p3.age=40;
		p3.name="ranjith";
		p1.eat();
		p1.sleep();
		p2.eat();
		p2.sleep();
		p3.eat();
		p3.sleep();
	}
}
