package abstraction;

public class Car_Main {
public static void main(String[] args) {
	
	Car_Innova_Crysta i=new Car_Innova_Crysta();
	i.brand="toyota";
	i.price=220000;
	System.out.println(i);
	i.gear();
	i.speed();
	i.noOfSeats();
	i.engine();
	i.wheelType();
	
	System.out.println();
	
	Car_Endeavour e=new Car_Endeavour();
	e.brand="Ford";
	e.price=450000;
	System.out.println(e);
	e.gear();
	e.noOfSeats();
	e.speed();
	e.engine();
}
}
