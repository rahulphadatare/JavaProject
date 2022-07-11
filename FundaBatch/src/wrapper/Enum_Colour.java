package wrapper;

import java.util.Arrays;

public class Enum_Colour {
public static void main(String[] args) {
	
	System.out.println(Colour.ORANGE);
	
	Colour c[]=Colour.values();
	
	System.out.println(Arrays.toString(c));
	
	for(Colour cr:c)
	{
		System.out.println(cr);
	}
}
}
