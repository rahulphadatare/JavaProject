package Classes_object;

public class Cars {
	void suzuki()
	{
		System.out.println("Cars+bikes");
	}
	void mercedes()
	{
		System.out.println("A-class+C-class+GLC-class");
	}
	void hyundai()
	{
		System.out.println("Creta+i20+i10");
	}
public static void main(String[] args) {
	Cars c1=new Cars();
	Cars c2=new Cars();
	Cars c3=new Cars();
	
	c1.suzuki();
	c2.mercedes();
	c3.hyundai();
}
}
