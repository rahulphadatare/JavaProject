package day3;

import java.util.Scanner;

public class Zodiacsign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day,month");
		int d=sc.nextInt();
		int m=sc.nextInt();
		
		if (m==1)
		{
			if(d>=1 && d<=19)
				System.out.println("Your zodiac sign is Capricon");
			else if (d>=20 && d<=31)
				System.out.println("Your zodiac sign is Aquaius");
			else
				System.out.println("Invalid data");
		}
		else if (m==2)
		{
			if(d>=1 && d<=19)
				System.out.println("Your zodiac sign is Aquaius");
			else if (d>=20 && d<=29)
				System.out.println("Your zodiac sign is Pisces");
			else
				System.out.println("Invalid data");
		}
		if (m==3)
		{
			if(d>=1 && d<=20)
				System.out.println("Your zodiac sign is Pisces");
			else if (d>=21 && d<=31)
				System.out.println("Your zodiac sign is Aries");
			else
				System.out.println("Invalid data");
		}
		if (m==4)
		{
			if(d>=1 && d<=20)
				System.out.println("Your zodiac sign is Aries");
			else if (d>=21 && d<=30)
				System.out.println("Your zodiac sign is Taurus");
			else
				System.out.println("Invalid data");
		}
		if (m==5)
		{
			if(d>=1 && d<=20)
				System.out.println("Your zodiac sign is Taurus");
			else if (d>=21 && d<=31)
				System.out.println("Your zodiac sign is Gemini");
			else
				System.out.println("Invalid data");
		}
		if (m==6)
		{
			if(d>=1 && d<=20)
				System.out.println("Your zodiac sign is Gemini");
			else if (d>=21 && d<=30)
				System.out.println("Your zodiac sign is Cancer");
			else
				System.out.println("Invalid data");
		}
		if (m==7)
		{
			if(d>=1 && d<=22)
				System.out.println("Your zodiac sign is Cancer");
			else if (d>=23 && d<=31)
				System.out.println("Your zodiac sign is Leo");
			else
				System.out.println("Invalid data");
		}
		if (m==8)
		{
			if(d>=1 && d<=22)
				System.out.println("Your zodiac sign is Leo");
			else if (d>=23 && d<=31)
				System.out.println("Your zodiac sign is Virgo");
			else
				System.out.println("Invalid data");
		}
		if (m==9)
		{
			if(d>=1 && d<=22)
				System.out.println("Your zodiac sign is Virgo");
			else if (d>=23 && d<=30)
				System.out.println("Your zodiac sign is Libra");
			else
				System.out.println("Invalid data");
		}
		if (m==10)
		{
			if(d>=1 && d<=22)
				System.out.println("Your zodiac sign is Libra");
			else if (d>=23 && d<=31)
				System.out.println("Your zodiac sign is Scorpio");
			else
				System.out.println("Invalid data");
		}
		if (m==11)
		{
			if(d>=1 && d<=22)
				System.out.println("Your zodiac sign is Scorpio");
			else if (d>=23 && d<=30)
				System.out.println("Your zodiac sign is Sagittarious");
			else
				System.out.println("Invalid data");
		}
		if (m==12)
		{
			if(d>=1 && d<=22)
				System.out.println("Your zodiac sign is Sagittarious");
			else if (d>=23 && d<=31)
				System.out.println("Your zodiac sign is Capricorn");
			else
				System.out.println("Invalid data");
		}
		
		
}
}