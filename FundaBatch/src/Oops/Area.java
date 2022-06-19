package Oops;

public class Area {

		void area(int r)
		{
			System.out.println("Area of circle= "+(3.14*(r*r)));
		}
		void area(int h, int b)
		{
			System.out.println("Area of triangle= "+(h*b)/2);
		}
		void area(float a)
		{
			System.out.println("Area of square= "+a*a);
		}
		void area(int w, float l)
		{
			System.out.println("Area of rectangle= "+(w*l));
		}
		
		public static void main(String[] args) {
			Area a=new Area();
			a.area(10.0f);
			a.area(10, 10);
			a.area(20);
			a.area(10, 10.20f);
		}
}
