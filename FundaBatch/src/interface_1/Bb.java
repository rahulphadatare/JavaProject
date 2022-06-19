package interface_1;

public interface Bb extends B {

	void travelling();
	void transport();
	
	default void days()
	{
		System.out.println("10 days trip");
	}
}
