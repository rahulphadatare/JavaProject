package Day1;

import java.util.Scanner;

public class Simple_intrest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value principle,rate of intrest and years");
	int p=sc.nextInt();
	int n=sc.nextInt();
	int r=sc.nextInt();
	int si=p*n*r/100;
	System.out.println("Simple intrest is ="+si);
}
}
