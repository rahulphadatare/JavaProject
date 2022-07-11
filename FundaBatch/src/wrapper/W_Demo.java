package wrapper;


public class W_Demo {
@SuppressWarnings("removal")
public static void main(String[] args) {
	
	int a=100;
	Integer i1= new Integer(100);
	Integer i3=new Integer(100);
	int i2=i1.intValue();
	System.out.println(i1==i3);//  	memory location
	System.out.println(i1.equals(i2));//   content
	
	
	Float f=new Float(230.0f);
	float f1=f;
	short s=f.shortValue();
	int i=f.intValue();
	byte b=f.byteValue();
	long l=f.longValue();
	double d=f.doubleValue();
}
}
