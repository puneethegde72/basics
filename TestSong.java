public class TestSong
{
	public static void main(String[] args)
	{
		Song s1=new Song("hi","hhhhhhhhhhhiiiiiiiiiiii");
		String q1=s1.getName();
		System.out.println(q1);
		String w1=s1.play();
		System.out.println(w1);
		Song s2=new Song("waw");
		String q2=s2.getName();
		System.out.println(q2);
		String w2=s2.play();
		System.out.println(w2);
	}
}

