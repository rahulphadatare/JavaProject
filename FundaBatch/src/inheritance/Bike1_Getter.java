package inheritance;

public class Bike1_Getter extends Bike_Getter {
	int weight;
	String model;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
