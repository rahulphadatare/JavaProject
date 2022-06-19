package Day1;

import java.util.Scanner;

public class Student_average_percentage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter markes of 5 subject");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int total_marks=500;
	int average=a+b+c+d+e;
	float percentage=average*100/total_marks;
	System.out.println("The average is ="+average);
	System.out.println("Percentage is ="+percentage+"%");
}
}
