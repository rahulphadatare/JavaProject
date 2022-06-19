package hirachical_inheritance;

public class Person_Student extends Person{
	int id,percentage;
	String dept;
	String grade;
	
	void setStudData(int id, int percentage, String dept)
	{
		this.id=id;
		this.percentage=percentage;
		this.dept=dept;
	}
	
	void grade()
	{
		if(percentage >70)
		{
			grade="First class";
		}
		else if(percentage >60)
		{
			grade="Second class";
		}
		else if(percentage >50)
		{
			grade="Third class";
		}
		else
		{
			grade="Fail";
		}
	}
	
	 void display()
		{
		 super.display();
			System.out.println(id+" "+percentage+" "+dept+" "+grade);
		}
}
