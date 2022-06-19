package inheritance;

public class Bike1 extends Bike{

//	class pulsor extends Bike{
		int weight;
			String model;
		void setPulsordata(int weight, String model)
		{
			this.weight=weight;
			this.model=model;
		}
		
		public String toString()
		{
			return brand+" "+model+" "+colour+" "+milage+" "+price+" "+weight;
		}
		
		void speed()
		{
			System.out.println("150 km/hr");
		}
	}

