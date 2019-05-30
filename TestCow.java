public class TestCow
{
	public static void main(String[] args)
	{
		Cow c1=new Cow();
		Cow c2=new Cow();
		c1.name="rama";
		c2.name="bhima";
		c1.moo();
		c2.moo();
		c1=c2;
		c1.moo();
		c1.name="koti";
		c1.moo();
	}
}

