package Bank;

public class Account {
	int acno, amt;
	String name, contact ;
	
	void setAcno(int acno)
	{
		this.acno=acno;
	}
	int getAcno()
	{
		return acno;
	}
	void setAmt(int amt)
	{
		this.amt=amt;
	}
	int getAmt()
	{
		return amt;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setContact(String contact)
	{
		this.contact=contact;
	}
	String getContact()
	{
		return contact;
	}
	
	public String toString()
	{
		return acno+" "+name+" "+amt+" "+contact;
		
	}
	
}
