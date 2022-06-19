package Car;

public class Car {
	int id, year, price;
	String name, brandname;
	
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	int getYear()
	{
		return year;
	}
	void setPrice(int price)
	{
		this.price=price;
	}
	int getPrice()
	{
		return price;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setBrandname(String brandname)
	{
		this.brandname=brandname;
	}
//	String getBrandname()
//	{
//		return brandname;
//	}
	public String toString()
	{
		return id+" "+name+" "+year+" "+price+" "+brandname;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
