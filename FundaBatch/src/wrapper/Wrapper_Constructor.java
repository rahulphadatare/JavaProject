package wrapper;

public class Wrapper_Constructor {
public static void main(String[] args) {
	
	Integer i=new Integer(100);
	Integer i1=new Integer("100");
	
	Character c=new Character('s');
	
	
	Float f=new Float(2.5f);
	Float f1=new Float(2.5);
	Float f2=new Float("2.5");
	
	
	// valueof... this is wrap a class to public static
	//3 overloaded method for short int long byte
	
	Integer i2=Integer.valueOf(100);
	Integer i3=Integer.valueOf("100");
	Integer i4= Integer.valueOf("111",2);// string and regx
	// 1*2^2+1*2^1+1*2^0= 4+2+1=7
	//the no is in string is always less than regx
	
	System.out.println(i4);
	
	int i5=Integer.parseInt("30");
	float f3=Float.parseFloat("20.5");
	System.out.println(i5);
	System.out.println(f3);
}
}
