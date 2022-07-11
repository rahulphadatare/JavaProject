package written_abstract;

public class Machine_Main {
public static void main(String[] args) {
	Machine_juicer j=new Machine_juicer();
	j.crush();
	j.rotate();
	j.filter();
	
	Machine m=new Machine_juicer();
	m.crush();
	m.rotate();
	//m.filter();
	
	
}
}
