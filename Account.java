public class Account
{
	String number;
	String owner;
	double balance;
	public void Withdraw(String acno,double amt)
	{
		if(acno==number)
		{
		if(balance==0)
		{
			System.out.println("accont balance is  empty");
		}
		else
		{
		balance=balance-amt;
		System.out.println("available balance is:"+balance);
		}
	}
	else
	System.out.println("incorect info");
	}
	public void Debit(double amt)
	{
		balance=balance+amt;
		System.out.println("available balance is:"+balance);
	}
	public void Balance(String acno)
	{
		if(acno==number)
		System.out.println("available balance is:"+balance);
		else
		System.out.println("enter correct info");
	}
}

