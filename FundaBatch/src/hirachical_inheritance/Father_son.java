package hirachical_inheritance;

public class Father_son extends Father {
String education;

	void setSonData(String education)
	{
		this.education=education;
	}
	
	public String toString()
	
	{
		return name+" "+surname+" "+age+" "+education;
	}
}
