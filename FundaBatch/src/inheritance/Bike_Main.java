package inheritance;

public class Bike_Main {
public static void main(String[] args) {
	Bike1 b=new Bike1();
	b.setBikedata(100000, "black", "50km/lt", "bajaj");
	b.setPulsordata(130, "pulsore");
	
	System.out.println(b);
	b.gear();
	b.seats();
	b.speed();
}
}
