package Bank;

import java.util.Scanner;

public class Bank_main {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  Account b1=new Account();
		  System.out.println("enter acno name amt ontact");
		  int acno=sc.nextInt();
		  String name=sc.next();
		  int amt=sc.nextInt();
		  String contact=sc.next();
		  b1.setAcno(acno);
		  b1.setName(name);
		  b1.setAmt(amt);
		  b1.setContact(contact);
		  System.out.println(b1);
		  Blance_deduction d=new Blance_deduction();
		  System.out.println("Enter amount to withdraw");
		  int a=sc.nextInt();
		  d.gpay(a, b1);
		  
		  
	}

 
}
