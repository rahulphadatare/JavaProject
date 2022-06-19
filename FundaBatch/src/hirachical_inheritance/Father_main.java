package hirachical_inheritance;

public class Father_main {
public static void main(String[] args) {
	
	Father_son s=new Father_son();
	s.setFatherData("abc", "xyz", 25);
	s.setSonData("BE");
	System.out.println(s);
	
	Father_Dauther d=new Father_Dauther();
	d.setFatherData("ABc", "xyz", 22);
		d.setDautherData("vespa");
		System.out.println(d);
	
}
}
