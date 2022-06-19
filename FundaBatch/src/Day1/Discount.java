package Day1;

import java.util.Scanner;

public class Discount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int shop_amount = sc.nextInt();
	if (shop_amount <= 10000)
	{
		int dis_amount=shop_amount/10;
		int total_amount=shop_amount-dis_amount;
		System.out.println("You shop "+shop_amount+" You got discount of 10%. "+dis_amount+ " Payble amount is ="+total_amount);
	}
	else
		{
		int dis_amount = shop_amount/20;
		int total_amount=shop_amount-dis_amount;
		System.out.println("You shop "+shop_amount+" You got discount of 20%. "+dis_amount+ " Payble amount is ="+total_amount);
		}
		
}
}
