package test5_polymorphism;

public class Peron_add {
	String state,city,country;
	
	void setCity(String city)
	{
		this.city=city;
	}
	void setState(String state)
	{
		this.state=state;
	}
	void setCountry(String country)
	{
		this.country=country;
	}
	
	String getCity()
	{
		return city;
	}
	String getState()
	{
		return state;
	}
	String getCountry()
	{
		return country;
	}
	
	public String toString()
	{
		return city+" "+state+" "+country;
	}
}
