public class Song
{
private String name;
private String lyrics;
public void setName(String a)
{
	if(a!=null)
	{
		name=a;
	}
	else
	System.out.println("enter the name first");
}
public String getName()
{
	System.out.print("the name of the song is   ");
	return name;
}
public void setLyrics(String b)
{
	if((b!=null)&&(name!=null))
	{
		lyrics=b;
	}
	else
	System.out.println("enter the lyrics first before playing it u dum ass");
}
public String play()
{
	System.out.print("this is "+name+" song lyrics   ");
	return lyrics;
}
public Song(String c,String d)
{
	if((c!=null)&&(d!=null))
	{
		name=c;
		lyrics=d;
	}

}
public Song(String e)
{
	if(e!=null)
	{
		name=e;
		System.out.println("the song name is "+name+" plz enter the lyrics of the song");
	}
	else
	System.out.println("enter the name first");
}
}

