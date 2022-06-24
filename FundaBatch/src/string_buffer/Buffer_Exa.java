package string_buffer;

public class Buffer_Exa {
public static void main(String[] args) {
	
	StringBuffer sbf=new StringBuffer("Java");
	
	sbf.append(" Language");
	System.out.println(sbf);
	
	System.out.println(sbf.capacity());
	System.out.println(sbf.length());
	
	sbf.delete(5, 8);
	System.out.println(sbf);
	
	sbf.insert(5, "Lan");
	System.out.println(sbf);
	
	sbf.replace(5, 8, "lAN");
	System.out.println(sbf);
//	
//	sbf.insert(5, 'L');
//	System.out.println(sbf);
	
	sbf.setCharAt(5, 'L');
	System.out.println(sbf);
	
	
}
}
