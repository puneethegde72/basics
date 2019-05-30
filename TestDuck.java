public class TestDuck
{
public static void main(String[] args)
{
	Duck d1=new Duck();
	Duck d2=new Duck();
	d1.size=10;
	d2.size=20;
	d1.swim();
	d2.swim();
	d1.size=d2.size;
	System.out.println("tail size is "+d1.size+" d2 size is "+d2.size);
	d1.size=30;
	System.out.println("tail size is "+d1.size+" d2 size is "+d2.size);
	d1=d2;
	System.out.println("tail size is "+d1.size+" d2 size is "+d2.size);
}
}