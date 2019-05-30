public class Joke
{
	static int count;
	private String text;
	public void setText(String a)
	{
		if(a!=null)
		{
			text=a;
			System.out.println("the joke has been copied to text");
		}
		else
		System.out.println("enter the joke for text ");
	}
	/*public String getText()
	{
		System.out.pirntln("the joke is:");
		return text;
	}*/
	public String print()
	{
		System.out.println("the joke is");
		return text;
	}
	public Joke(String b)
	{
		if(b!=null)
		{
			System.out.println("the joke has been entered");
			text=b;
		}
		else
		System.out.println("enter the joke first simply dont creat the object");
		count++;
	}
}