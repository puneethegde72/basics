public class Pen
{
	int inkQty;
	String colour;
	public void write(String data)
		{
			if(inkQty>0)
			{
			System.out.println(data);
			inkQty--;
			}
			else
			System.out.println("fill the ink first");
		}
	public void refill(int i)
	{
		inkQty=inkQty+i;
	}
}