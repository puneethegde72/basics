public class Tv
{
	String name;
	int channel;
	int volume;
	int dup;
	public void changeCh(int i)
	{
		channel=i;
		System.out.println("channel changed  to"+channel);
	}
	public int displayCh()
	{
		return channel;
	}
	public void incVol(int v)
	{
		volume=volume+v;
		System.out.println("the current volume is"+volume);
	}
	public void decVol(int d)
	{
		dup=volume;
		volume=volume-d;
		if(volume<0)
		{
			System.out.println("not possible");
			volume=dup;
			System.out.println("the current volume is"+volume);
		}
		if(volume==0)
		{
			System.out.println("tv is in mute");
		}
		System.out.println("the current volume is"+volume);
	}
}