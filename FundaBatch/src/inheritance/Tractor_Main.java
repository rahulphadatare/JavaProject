package inheritance;

public class Tractor_Main {
public static void main(String[] args) {
	
	Tractor_Arun_ultra_Novo t=new Tractor_Arun_ultra_Novo();
	t.setDataTractor(1, 900000, "2ltr/hr");
	t.setDataArjun("Arjun", "black");
	t.setDataNovo(20, "605 di");
	
	System.out.println(t);
	
	t.gear();
}
}
