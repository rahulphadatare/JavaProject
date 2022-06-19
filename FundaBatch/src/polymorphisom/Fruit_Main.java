package polymorphisom;
 class Fruit
 {
	 void eat()
	 {
		 System.out.println("Fruit is good for health");
	 }
 }
 class Apple extends Fruit
 {
	 void eat()
	 {
		 System.out.println("Applw is good for eys");
	 }
 }
 class Mango extends Fruit
 {
	 void eat()
	 {
		 System.out.println("mango is sweet in test");
	 }
 }
public class Fruit_Main {
public static void main(String[] args) {
	
	//dynamic method dispatch
	Fruit f=new Fruit();
	f.eat();
	
	f=new Apple();  // upcasting
	f.eat();
	
	f=new Mango();
	f.eat();
}
}
