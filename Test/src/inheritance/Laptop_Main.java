package inheritance;

import java.util.Scanner;

public class Laptop_Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of ports and speed");
	int noOfUSBPort=sc.nextInt();
	int processorSpeed=sc.nextInt();
	
	Laptop l=new Laptop();
	l.setNoOfUSBPort(noOfUSBPort);
	l.setProcessorSpeed(processorSpeed);
	
	System.out.println(l.getNoOfUSBPort()+" "+l.getProcessorSpeed());
}
}
