package Test4_Arrays;
import java.util.Scanner;
public class Symatrix {


		void display(int a[][],int r, int c)
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();
			}
			
		}
		
		void d2(int a[][],int c,int r)
		{
			System.out.println("Transpose");
			int b[][]=new int[c][r];
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<r;j++)
				{
					b[i][j]=a[j][i];
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			
			int d=0;
			for(int i=0;i<c;i++)
			{
				for(int j=0;j<r;j++)
				{
					if(b[i][j]==a[i][j])
					{
						d++;
					}
			
				}
				System.out.println();
			}
			if(d==(c*r))
			{
				System.out.println("The matrix is sysmetric");
			}
			else
			{
				System.out.println("The matrix is not sysmetric");
			}
			
			
		}
		
	
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter r and c");
			int r=sc.nextInt();
			int c=sc.nextInt();
			System.out.println("Enter "+(r*c)+" no");
			int a[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			Symatrix a1=new Symatrix();
			a1.display(a, r, c);
			a1.d2(a, c, r);
			
		}
	

}
