package Moc;

public class TTTTT {
public static void main(String[] args) {
	 
	int n=0;
	int num=1221;
	int b=num;
	while(num!=0)	
	{
			int a=num%10;
			n=n*10+a;
			num=num/10;
		
	}
		if(b==n)
		{
			System.out.println("p");
		}
	}

}
