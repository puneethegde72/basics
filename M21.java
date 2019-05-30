package basics;
/*class CalRef{
	int a=200;
	void add(int q)
	{
		a=a+q;
	}
	
}
class Overl{
	int b=31;
	void add()
	{
		b+=32;
		System.out.println("b="+b);
		b=b+1;
	}
	void add(int c)
	{
		b=b+c;
		System.out.println("overloded with parameter ");
		
	}
}
class Animal
{
	void eat()
	{
		System.out.println("eating ....");
	}
	void drink()
	{
		System.out.println("drinking... water");
	}
	void dancing()
	{
		System.out.print("dinka chaka");
	}
}
class Tiger extends Animal {
	void eat()
	{
		System.out.println("eating non veg");
	}
	void dance()
	{
		System.out.println("chiyya chiyya ");
	}
}
class dog extends Animal {
	void eat()
	{
		System.out.println("eating veg");
	}
	void drink()
	{
		System.out.println("drinking milk");
	}
	
}
interface Car
{
	void drive();
	void revrce();
	void nutral();
}
class Lambo implements Car{
	public void drive()
	{
		System.out.println("going forword yeeeeeeeeeeee");
	}
	public void revrce()
	{
		System.out.println("going backword");
	}
	public void nutral()
	{
		System.out.println("vehical not moving");
	}

class Vehical
{
	void drive()
	{
		System.out.println("vehical is moving forword");
	}
	void breaking()
	{
		System.out.println("vehial is stoping");
	}
}
class car extends Vehical{
	void drive()
	{
		System.out.println("vehical going backwords ");
	}
	void breaking()
	{
		System.out.println("vehical is stoped");
	}
}*/
class Animal
{
	void eat()
	{
		System.out.println("eating ....");
	}
	void drink()
	{
		System.out.println("drinking...");
	}
	void dancing()
	{
		System.out.print("dinka chaka");
	}
}
class Cat extends Animal {
	void eat()
	{
		System.out.println("eating non veg");
	}
	void dancing()
	{
		System.out.println("miao ");
	}
}
class Dog extends Animal {
	public void eat()
	{
		System.out.println("eating veg");
	}
	void drink()
	{
		System.out.println("drinking water");
	}
	
}
class Matl{
int i=10;
int j=10;
int k;
void add()
{
	k=i+j;
	System.out.println(k);
}
void add(int a)
{
	k=i+j+a;
	System.out.println(k);
	}
void add(int a,int b)
{
	k=i+j+a+b;
	System.out.println(k);
}
void add(double a)
{
	k=(int)a+i+j;
	System.out.println(k);
}
}


public class M21 {
public static void main(String args[])
{
	Animal t=new Cat();
		t.eat();
		t.drink();
		t.dancing();

	Animal d=new Dog();
		d.eat();
		d.drink();
		d.dancing();
		
	Matl m=new Matl();
	m.add();
	m.add(10);
	m.add(10, 20);
	m.add(20.2);

	
	
	/*int a=39;
	Integer i=Integer.valueOf(a);
	System.out.println(a+" "+i);
	Integer q=new Integer(92);
	int w=0;
	int w1=q.intValue();
	int w11=q;
	System.out.println(q+""+w11);
	CalRef b=new CalRef();
	System.out.println("the value of a:"+b.a);
	b.add(1000);
	System.out.println("the value of a after change:"+b.a);
	Overl o=new Overl();
	o.add();
	System.out.println(o.b);
	o.add(210);
System.out.print(o.b);
	Animal t=new Tiger();
			{
				t.eat();
				t.drink();
				t.dancing();
		
			}
			Animal d=new dog();
			{
				d.eat();
				d.drink();
				d.dancing();
				
			}
	Lambo l=new Lambo();
	l.drive();
	l.revrce();
	l.nutral();
	int a;
	int a1=100;
	try
	{
		a1= a1/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("error in b");
	}
	
	finally
	{
		System.out.println("however it will print");
	}*/
	
	
}


}
