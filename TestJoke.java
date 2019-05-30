public class TestJoke
{
	public static void main(String[] args)
	{
		Joke j1=new Joke("coooooooooooo");
		String q1=j1.print();
		System.out.println(q1);
		System.out.println(Joke.count);
		Joke j2=new Joke("kooooooooooooo");
		String q2=j2.print();
		System.out.println(q2);
		System.out.println(Joke.count);
		Joke j3= new Joke("booooooooooo");
		System.out.println(Joke.count);
		String q3=j3.print();
		System.out.println(q3);
	}
}
