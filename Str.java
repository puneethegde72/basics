public class Str
{
	public static void main(String[] args)
	{
		String a="abcdef";
		char[] c=new char[100];
		for(int i=0;i<a.length();i++)
		{
			c[i]=a.charAt(i);
			System.out.println(c[i]);
		}
		String b=a.toUpperCase();
		System.out.println(b);
		String d=b.toLowerCase();
		System.out.println(d);
		String e="hakapati";
		int f=a.compareTo(e);
		System.out.println(f);
		Boolean g=a.equals(e);
		System.out.println(g);





		//System.out.println("lenth is ="+a.length());
		//System.out.println("the character is:"+a);
	}
}