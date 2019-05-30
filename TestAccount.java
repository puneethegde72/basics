public class TestAccount
{
	public static void main(String[] args)
	{
		Account a1=new Account();
		Account a2=new Account();
		a1.number="a123456";
		a2.number="b789102";
		a1.owner="sharma";
		a2.owner="shetty";
		a1.balance=10000.23;
		a2.blance=25347.26;
		a1.balance();
		a1.Debit(2000);
		a1.balance();
		a1.Withdraw(1000);
		a1.balance();
		a2.balance();
		a2.Debit(1256);
		a2.balance();
		a2.Withdraw(1267.23);
		a2.balance();
	}
}