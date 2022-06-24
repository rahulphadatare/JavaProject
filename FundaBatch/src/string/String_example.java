package string;

import java.util.Arrays;

public class String_example {
public static void main(String[] args) {
	
	String s1="Java";   // literals
	String s2="java";
	String s3="core";
	String s4="unhappy";
	String s5=new String("Java");   //new keyword
	
	String s6=new String("Java");
	String s7=      "java"     ;
	
	
	System.out.println(s1==s2);  // it check memory location 
	System.out.println(s1==s5);
	System.out.println(s5==s6);
	
	System.out.println(s1.equals(s2));  // its check the content
	System.out.println(s1.equals(s5));
	System.out.println(s5.equals(s6));
	
	System.out.println("remove space: "+s7.trim()); //it is used to remove befor and after spacess
	
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2)); // to add to string
	
	System.out.println(s1.compareTo(s2)); // is compair on ascii base 
	//s1>s2   then value -ve
	//s1<s2        value +ve
	//s1==s2               0
	System.out.println(s1.compareToIgnoreCase(s2));
	
	System.out.println(s1.replaceFirst("j", "j"));
	System.out.println(s1.replace("J", "m"));
	
	System.out.println(s1.charAt(3));  //show char at that position
	System.out.println(s4.substring(2));  // display all char from index 2
	System.out.println(s4.substring(2, 4)); //display form index 2 to index 4
	
	char c[]=s1.toCharArray();  // covert string into array
	System.out.println(Arrays.toString(c));
	
	System.out.println(s1.toLowerCase()); // covert overall string into lowecase
	System.out.println(s4.toUpperCase()); //convert string into uppercase
	
	String a="rahul s phadatare";
	System.out.println(a.replaceAll(" ", ""));//remove space
	
	
}
}
