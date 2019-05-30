public class Persons
{
private String name;
private int age;
public void setName(String a)
{
	if(a!=null)
	{
		name=a;
	}
	else
	System.out.println("enter some string");
}
public String getName()
{
	System.out.println("the name is");
	return name;
}
public void setAge(int b)
{
	if(b>0&&b<100)
	{
		age=b;
	}
	else
	System.out.println("enter the valid age");
}
public int getAge()
{
	System.out.println("the age is");
	return age;
}

public void display()
{
	System.out.println("i'm"+name+"and i'm"+age+"years of old");
}
public Persons(String q,int w)
{
	name=q;
	age=w;

}
