package interface_1;

public interface A_Collage {

	void uniform();
	void idCard();
	void transport();
	
	default void lab()  // default is used to reduce or remove backward compatibility
	{
		System.out.println("lab is compulsory");
	}
	

	
	private void account()
	{
		System.out.println("its confidential");
	}
	static void mess()
	{
	
		System.out.println("mess is not compulsory");
	}
	default void labrary()  // default is used to reduce or remove backward compatibility
	{
		account();
		
		System.out.println("lab is compulsory");
	}
}
