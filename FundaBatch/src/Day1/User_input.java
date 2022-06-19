package Day1;
import java.util.Scanner;
public class User_input {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("New number");
	int new_no = s.nextInt();
	int cube=new_no*new_no*new_no;
	System.out.println("Cube is ="+cube);
}
}
