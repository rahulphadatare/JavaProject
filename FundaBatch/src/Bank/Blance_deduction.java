package Bank;

public class Blance_deduction {
void gpay(int amt, Account a)
{
	
	int b=a.getAmt();
	System.out.println("Balance= "+b);
	if(amt<b)
	{
	int bal=b-amt;
	System.out.println("Remaining balance is: "+bal);
	}
	else
	{
		System.out.println("your balance is low...");
	}
}
}
