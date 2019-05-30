public class TestTv
{
	public static void main(String[] args)
	{
		Tv a=new Tv();
		a.name="sony";
		a.channel=20;
		a.volume=30;
		a.displayCh();
		a.changeCh(35);
		a.incVol(10);
		a.decVol(30);
	}
}
