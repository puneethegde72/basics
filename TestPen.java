public class TestPen
{
	public static void main(String[] args)
	{
		Pen p1=new Pen();
		Pen p2=new Pen();
		p1.inkQty=50;
		p2.inkQty=20;
		for(int k=0;k<10;k++)
		p1.write("olalaleyo leyo olalaleyo leyo");
		for(int j=0;j<4;j++)
		p2.write("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		System.out.println("p1 ink="+p1.inkQty);
		System.out.println("p2 ink="+p2.inkQty);
		p1.refill(5);
		p2.refill(2);
		System.out.println("p1 ink with added 5ml of ink="+p1.inkQty);
		System.out.println("p2 ink with added 2ml of ink="+p2.inkQty);
	}
}