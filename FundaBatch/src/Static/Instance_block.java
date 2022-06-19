package Static;

public class Instance_block {
     int id,mark;
     String name,dept;
     static String clgname;
     
     {		// instance block is created befor constructor in evry class
    	 id=100;
    	 mark=70;
    	 name="aaa";
    	 dept="bbb";
    	 clgname="ccc";// ststic method is call directly
    	 System.out.println("I'm in instance block");
     }
     Instance_block()// if constructor save value then only constructor value are printed
     {
//    	 id=70;
//    	 name="aaa";
//    	 dept="bbb";
//    	 mark=50;
//    	 clgname="ttt";
    	 System.out.println("default constructor");
     }
     public String toString()
     {
    	 return id+" "+name+" "+mark+" "+dept;
     }
     
     public static void main(String[] args) {
    	 Instance_block s=new Instance_block();
    	 System.out.println(s);
	}
}
